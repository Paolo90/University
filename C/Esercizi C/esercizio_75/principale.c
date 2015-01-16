#include <stdio.h>
#include <stdlib.h>
#include <string.h>
typedef struct matricola{
	char *nome_materia;
	int voto;
	int data[3];
	struct matricola *next;
}studente;
void display(studente *start){
	studente *i;
	for(i=start;i!=NULL;i=i->next){
		puts("--------------------------");
		printf("Nome materia: %s\n",i->nome_materia);
		printf("Voto: %i\n",i->voto);
		printf("Sostenuto in data: %i/%i/%i\n",(i->data)[0],(i->data)[1],(i->data)[2]);
		puts("---------------------------");
	}
}
studente* crea(char *materia){
	studente *i=malloc(sizeof(studente));
	i->nome_materia=strdup(materia);
	i->voto=0;
	(i->data[0])=0;
	(i->data)[1]=0;
	(i->data[2])=0;
	i->next=NULL;
	return i;
}
void rilascia(studente *start){
	studente *i;
	studente *next=NULL;
	for(i=start;i!=NULL;i=next){
		next=i->next;
		free(i->nome_materia);
		free(i);
	}
}

int main(){
	studente *start=NULL;
	studente *i=NULL;
	studente *next=NULL;
	char nome[80];
	puts("Inserisci il nome della materia");
	for(;fgets(nome,sizeof(nome),stdin)!=NULL;i=next){
		next=crea(nome);
		if(start==NULL)
			start=next;
		if(i!=NULL)
			i->next=next;
		puts("Inserisci il nome della materia");
	}
	for(i=start;i!=NULL;i=i->next){
		puts("Inserisci il voto");
		scanf("%i",&(i->voto));
		puts("Inserisci la data un campo alla volta");
		scanf("%i",&((i->data)[0]));
		scanf("%i",&((i->data)[1]));
		scanf("%i",&((i->data)[2]));
	}
	display(start);
	rilascia(start);
	return 0;
}
