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
			printf("Invalid Latitude:%f",latitude);
			return 2; /*Errore di uscita di tipo 2*/
		}
		if ((longitude<-180) || (longitude>180)){
			printf("Invalid Longitude: %f", longitude);
			return 2;
		}
		printf("{Latitude: %f Longitude: %f Info: Speed= %s}",latitude, longitude, info);
	}
	puts("]\n");
	return 0;
}
