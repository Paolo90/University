#include<strum.h>
void rilascia(studente *start){
	studente *i;
	studente *next=NULL;
	for(i=start;i!=NULL;i=next){
		next=i->next;
		free(i->nome_materia);
		free(i);
	}
}
