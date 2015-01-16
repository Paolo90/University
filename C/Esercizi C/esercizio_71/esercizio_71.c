#include <stdio.h>
#include <stdlib.h>
#include <string.h>
typedef struct dipendente{
	char *cognome;
	int paga;
	struct dipendente *next;
}dip;
/* Funzione che crea un elemento della lista concatenata a partire dal nome */
dip* crea(char *cognome){
	dip *p=malloc(sizeof(dip));
	p->cognome=strdup(cognome);
	p->paga=0;
	p->next=NULL;
	return p;
}
/* funzione che libera la memoria a partire dal nodo di partenza*/
void rilascia(dip *start){
	dip *i;
	dip *next=NULL;
	for(i=start;i!=NULL;i=next){
		next=i->next;
		free(i->cognome); /* qui c'è l'indirizzo della stringa... la stringa vive da un'altra parte quindi va liberata a parte*/
		/* free(&(i->paga)); non c'è bisogno ... lo libero con il comando successivo*/
		free(i);
	}
}
void display(dip *start){
	for(;start!=NULL;start=start->next){ /* Vai avanti fino all'ultimo nodo */
		printf("%s %i\n",start->cognome, start->paga);
	}
}
int main(){
	dip *start=NULL;
	dip *i=NULL;
	dip *next=NULL;
	FILE *file_in=fopen("impiegati.txt","r");
	char cogn[80];
	dip *max=NULL;
	while(fscanf(file_in,"%s",cogn)==1){
		next=crea(cogn);
		if(start==NULL)
			start=next; /**/
		fscanf(file_in,"%i",&(next->paga));
		if(i!=NULL)
			i->next=next;
		i=next;
	}
	display(start);
	rilascia(start); /* Libero tutta la memoria */
	fclose(file_in);
	return 0;
}
