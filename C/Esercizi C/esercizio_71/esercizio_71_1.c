#include <stdio.h>
#include <string.h>
#include <stdlib.h>
typedef struct dipendente{
	char *cognome;
	int paga;
	struct dipendente *next;
}dip;
void massimo_stipendio(dip *start){
	char *surname=start->cognome;
	int max_paga=start->paga;
	dip *i;
	dip *next=NULL;
	for(i=start;i->next!=NULL;i=next){
		next=i->next;
		if((next->paga) > max_paga){
			max_paga=next->paga;
			surname=next->cognome;
		}
	}
	printf("%s %i", surname, max_paga);
}
dip* crea(char *nome){
	dip *p=malloc(sizeof(dip));
	p->cognome=strdup(nome);
	p->paga=0;
	p->next=NULL;
}
void release_memory(dip *start){
	dip *i;
	dip *next=NULL;
	for(i=start;i!=NULL;i=next){
		next=i->next;
		free(i->cognome);
		free(i);
	}
}
int main(){
	dip *start=NULL;
	dip *current=NULL;
	dip *next=NULL;
	char surname[80];
	puts("Inserisci il cognome: ");
	for(;scanf("%79s",surname)==1;current=next){
		next=crea(surname);
		puts("paga");
		scanf("%i",&(next->paga));
		if(start==NULL)
			start=next;
		if(current!=NULL)
			current->next=next;
		puts("Inserisci il cognome: ");
	}
	massimo_stipendio(start);
	puts("");
	puts("-----------------------------");
	release_memory(start);
	return 0;
}
