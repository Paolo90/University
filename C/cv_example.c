#include <highgui.h>
#include <stdio.h>
int main()
{
   CvCapture * capture1=cvCaptureFromCAM(0);
   CvCapture * capture2=cvCaptureFromCAM(1);
   if(!capture1)
   {
      printf("Cannot find device1!\n");
      exit(0);
   }
   if(!capture2)
   {
      printf("Cannot find device2!\n");
      exit(0);
   }
   IplImage * image1=0;
   IplImage * image2=0;
   cvNamedWindow("Grab1");
   cvNamedWindow("Grab2");
   while(1)
   {
      image1=cvQueryFrame(capture1);
      image2=cvQueryFrame(capture2);
      if(!image1||!image2)
         break;
      cvShowImage("Grab1",image1);
      cvShowImage("Grab2",image2);
      int key=cvWaitKey(10);
      if(27==key)
         break;
   }
   cvReleaseCapture(&capture1);
   cvReleaseCapture(&capture2);
   cvDestroyWindow("Grab1");
   cvDestroyWindow("Grab2");

   return 0;
}
