#include <stdio.h>
int main(){
	float latitude;
	float longitude;
	char info[80];
	int started=0; /* false */
	puts ("data=[\n");
	while (scanf("%f,%f,%79s[^\n]",&latitude, &longitude, info)==3){ /*la funzione scanf ritorna il numero di elementi che legge. [^\n] vuol dire restituisci tutti i caratteri fino alla fine della riga. Scanf usa SEMPRE i puntatori*/
		if (started){
			printf(",\n");
		}else{
			started=1;
		}
		printf("{Latitude: %f Longitude:%f Info: %s}",*&latitude, longitude, info); /*printf() non ha bisogno di puntatori ma dei valori delle variabili. Se proprio voglio usare i puntatori devo comporre * con l'inverso & */
	}
	puts("]\n");
	return 0;
}
