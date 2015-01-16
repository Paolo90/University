#include <stdio.h>
int main(){
	float latitude;
	float longitude;
	char info[80];
	int started=0; /* false */
	puts ("data=[\n");
	while (scanf("%f,%f,%79s[^\n]",&latitude, &longitude, info)==3){
		if (started){
			printf(",\n");
		}else{
			started=1;
		}
		if ((latitude<-90) || (latitude>90)){
			fprintf(stderr,"Invalid Latitude:%f\n",latitude);
			return 2; /*Errore di uscita di tipo 2*/
		}
		if ((longitude<-180) || (longitude>180)){
			fprintf(stderr,"Invalid Longitude: %f\n", longitude);
			return 1;
		}
		printf("{Latitude: %f Longitude: %f Info:%s}",latitude, longitude, info);
	}
	puts("]\n");
	return 0;
}
