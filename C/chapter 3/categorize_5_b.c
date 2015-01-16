/*Questo programma è una versione equivalente del programma categorize_5. Qui si fa uso dei normali flussi dati in addizione a due aggiuntivi.*/
#include <stdio.h>
#include<stdlib.h> /*Serve per creare nuovi flussi dati*/
#include<string.h>
int main(){
/* Sia in l'indirizzo di spooky.csv e siano file1, file 2 e file 3 rispettivamente gli indirizzi dei files uf.csv, disappearences.csv e others.csv*/
	char line[80];
	FILE *file2=fopen("disappearences.csv","w");
	FILE *file3=fopen("others.csv","w");
	while(scanf("%79s[^\n]\n",line)==1){ /* Interpreta tutta la linea come stringa quindi sui file di output avremo numeri e testo. Usiamo lo standared input invece di creare un nuovo flusso. */
		if (strstr(line,"UFO")){
			fprintf(stdout,"%s\n",line); /*Uso lo standard output*/
		}else if(strstr(line,"Disappearance")){
			fprintf(file2,"%s\n",line);
		}else{
			fprintf(file3,"%s\n",line);
		}
	}
/* Fuori dal while chiudo manualmente i flussi dati che ho creato. L'argomento di fclose() è UN INDIRIZZO */
	fclose(file2);
	fclose(file3);
	return 0;
}
