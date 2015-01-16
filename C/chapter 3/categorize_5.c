/*Questo programma legge i dati ricevuti tramite un gps (spooky.csv) e li scrive su uno dei tre file ufo.csv, disappearences.csv o others.csv*/
#include <stdio.h>
#include<stdlib.h> /*Serve per creare nuovi flussi dati*/
#include<string.h>
int main(){
/* Sia in l'indirizzo di spooky.csv e siano file1, file 2 e file 3 rispettivamente gli indirizzi dei files uf.csv, disappearences.csv e others.csv*/
	char line[80];
	FILE *in=fopen("spooky.csv","r");
	FILE *file1=fopen("ufo.csv","w");
	FILE *file2=fopen("disappearences.csv","w");
	FILE *file3=fopen("others.csv","w");
	while(fscanf(in,"%79s[^\n]\n",line)==1){ /* Interpreta tutta la linea come stringa quindi sui file di output avremo numeri e testo. Potevo usare anche lo standard input. */
		if (strstr(line,"UFO")){
			fprintf(file1,"%s\n",line);
		}else if(strstr(line,"Disappearance")){
			fprintf(file2,"%s\n",line);
		}else{
			fprintf(file3,"%s\n",line);
		}
	}
/* Fuori dal while chiudo manualmente i flussi dati che ho creato. L'argomento di fclose() è UN INDIRIZZO */
	fclose(in);
	fclose(file1);
	fclose(file2);
	fclose(file3);
	return 0;
}
