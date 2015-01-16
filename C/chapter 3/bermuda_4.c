/* Filtra i dati del file spooky.csv */
#include <stdio.h>
int main(){
	float latitude;
	float longitude;
	char info[80];
	while (scanf("%f, %f, %79s[^\n]",&latitude, &longitude, info)==3){ /* Quando finiscono le righe del file esco dal ciclo */
		if ((latitude>26)&&(latitude<34)){
			if ((longitude>-76)&&(longitude<-64)){
				printf("%f,%f,%s\n",latitude, longitude, info);
			}
		}
	}
	return 0;
}
