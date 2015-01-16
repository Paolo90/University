/*Esempio di come fgets() e scanf() possono essere usate insieme senza conflitto SE condividono stream dati diversi*/
#include<stdio.h>
int main(int argc,char* argv[]){
	FILE *in=fopen(argv[1],"r");
	if(!in){
		fprintf(stderr,"Errore, file non valido\n");
		return 1;
	}
	int t;
	char stringa[80];
	while(fgets(stringa,sizeof(stringa),in)){
		puts("Inserisci un numero");
		scanf("%i",&t);
		printf("%s %i\n",stringa,t);
	}
	fclose(in);
	return 0;
}
