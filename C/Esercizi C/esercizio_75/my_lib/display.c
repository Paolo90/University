#include<strum.h>
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
