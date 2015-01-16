/* Progetto OpenCV Programmazione I con laboratorio
Paolo Piersanti
Laurea Magistrale Matematica*/

#ifdef _CH_
#pragma package <opencv>
#endif

#ifndef _EiC
#include "cv.h"
#include "highgui.h"
#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>
#include <windows.h>
#endif

IplImage *image = 0, *grey = 0, *prev_grey = 0, *pyramid = 0, *prev_pyramid = 0, *swap_temp;

int win_size = 10;
int comp_cond=0;
const int MAX_COUNT = 500;
CvPoint2D32f* points[2] = {0,0}, *swap_points;
char* status = 0;
int count;
int need_to_init = 0;
int night_mode = 0;
int flags = 0;
int add_remove_pt = 0;
int p;
int q=1;
CvPoint pt;

int main( int argc, char** argv )
{
    CvCapture* webcam = cvCreateCameraCapture(0);
	if(!webcam){
                printf("ERROR: webcam not found. The program is now exiting!!! ");
                return 2;
    	}

    /* print a welcome message, and the OpenCV version */
    printf ("Welcome to Project OpenCV, using OpenCV version %s (%d.%d.%d)\n",
	    CV_VERSION,
	    CV_MAJOR_VERSION, CV_MINOR_VERSION, CV_SUBMINOR_VERSION);

    printf( "Hot keys: \n"
            "\tESC - quit the program\n"
            "\tr - auto-initialize tracking\n"
            /*"\tc - delete all the points\n"*/
             );

    cvNamedWindow( "LkDemo", 0 );
    for(;;)
    {
        IplImage* frame = 0;
        int i, k, c;

        frame = cvQueryFrame(webcam);
        if( !frame )
            break;

        if( !image )
        {
            /* allocate all the buffers */
            image = cvCreateImage( cvGetSize(frame), 8, 3 );
            image->origin = frame->origin;
            grey = cvCreateImage( cvGetSize(frame), 8, 1 );
            prev_grey = cvCreateImage( cvGetSize(frame), 8, 1 );
            pyramid = cvCreateImage( cvGetSize(frame), 8, 1 );
            prev_pyramid = cvCreateImage( cvGetSize(frame), 8, 1 );
            points[0] = (CvPoint2D32f*)cvAlloc(MAX_COUNT*sizeof(points[0][0]));
            points[1] = (CvPoint2D32f*)cvAlloc(MAX_COUNT*sizeof(points[0][0]));
            status = (char*)cvAlloc(MAX_COUNT);
            flags = 0;
        }

        cvCopy( frame, image, 0 );
        cvCvtColor( image, grey, CV_BGR2GRAY );
        
        if( need_to_init )
        {
            /* automatic initialization */
            IplImage* eig = cvCreateImage( cvGetSize(grey), 32, 1 );
            IplImage* temp = cvCreateImage( cvGetSize(grey), 32, 1 );
            double quality = 0.01;
            double min_distance = 10;

            count = MAX_COUNT; /* count vale 500 */
            cvGoodFeaturesToTrack( grey, eig, temp, points[1], &count,
                                   quality, min_distance, 0, 3, 0, 0.04 );
            cvFindCornerSubPix( grey, points[1], count,
                cvSize(win_size,win_size), cvSize(-1,-1),
                cvTermCriteria(CV_TERMCRIT_ITER|CV_TERMCRIT_EPS,20,0.03));
            cvReleaseImage( &eig );
            cvReleaseImage( &temp );

            add_remove_pt = 0;
        }
        else if( count > 0 )
        {
            cvCalcOpticalFlowPyrLK( prev_grey, grey, prev_pyramid, pyramid,
                points[0], points[1], count, cvSize(win_size,win_size), 3, status, 0,
                cvTermCriteria(CV_TERMCRIT_ITER|CV_TERMCRIT_EPS,20,0.03), flags );
            flags |= CV_LKFLOW_PYR_A_READY;
            for( i = k = 0; i < count; i++ )
            {
                /*if( add_remove_pt )
                {
                    double dx = pt.x - points[1][i].x;
                    double dy = pt.y - points[1][i].y;

                    if( dx*dx + dy*dy <= 25 )
                    {
                        add_remove_pt = 0;
                        continue;
                    }
                }*/
                
                if( !status[i] )
                    continue;
                
                points[1][k++] = points[1][i];
                cvCircle( image, cvPointFrom32f(points[1][i]), 3, CV_RGB(0,255,0), -1, 8,0);
            }
            count = k;
        }

        /*if( add_remove_pt && count < MAX_COUNT )
        {
            points[1][count++] = cvPointTo32f(pt);
            cvFindCornerSubPix( grey, points[1] + count - 1, 1,
                cvSize(win_size,win_size), cvSize(-1,-1),
                cvTermCriteria(CV_TERMCRIT_ITER|CV_TERMCRIT_EPS,20,0.03));
            add_remove_pt = 0;
        }*/

        CV_SWAP( prev_grey, grey, swap_temp );
        CV_SWAP( prev_pyramid, pyramid, swap_temp );
        CV_SWAP( points[0], points[1], swap_points );
        need_to_init = 0;
        cvShowImage( "LkDemo", image );

        c = cvWaitKey(10);
        if( (char)c == 27 )
            break;
        switch( (char) c )
        {
        case 'r':
            need_to_init = 1;
            p=1;
            q=1;
            break;
        case 'c':
            /*count = 0*/;
            break;
        default:
            ;
        }
        if (p!=0){ /* Interruttore tracciamento */
                  printf("Activation in 5 seconds\n");
                  Sleep(5000);
                  p=0;
                  comp_cond=1;
        }
        if (comp_cond!=0){
                          
                          char features_found[ MAX_COUNT ];
                          float feature_errors[ MAX_COUNT];
                          printf("Count is: %i\n",count);
                          /*for(i=0; i<count; i++ ) {
                                   ;
		                       /*if( features_found[i]==0|| feature_errors[i]>550000000000000 ) {
			                       printf("Error is %f\n",feature_errors[i]);
			                       continue; 
		                       }
                         }*/
                         if (count<200 && count >0){
                            system("cls");
                            system("color C");
                            printf("Intrusion detection\n"); 
                            IplImage* image_thief = cvQueryFrame(webcam);
                            cvSaveImage("thief.jpg", image_thief);
                            Beep(10000, 2000);
                            count=500;
                            return 0;
                            }else{
                                  printf("No intrusion has been detected\n");
                                  }
                         }                                         
    }

    cvReleaseCapture( &webcam );
    cvDestroyWindow("LkDemo");

    return 0;
}

#ifdef _EiC
main(1,"lkdemo.c");
#endif
