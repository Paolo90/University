#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct risultato{
	char *nome;
	int ori;
	int argenti;
	int bronzi;
	struct risultato *next;
}medaglie;
void release(medaglie *start){
	medaglie *i;
	medaglie *next;
	for(i=start;i!=NULL;i=next){
		next=i->next;
		free(i->nome);		
		free(i);
	}
}
int ordina_ori(const void* a, const void*b){
	medaglie* sa =(medaglie*)a;
	medaglie* sb =(medaglie*)b; 
	return (sa->ori - sb->ori);
}
/*medaglie* classifica(medaglie *start, int t){
	medaglie *next=NULL;
	medaglie *i=start;
	int M[t][3];
	int k=0;
	for(;i!=NULL;i=next){
		M[k][1]=i->ori;
		M[k][2]=i->argenti;
		M[k][3]=i->bronzi;
		k++;
		next=i->next;
	}
	int v_o[t];
	int v_a[t];
	int v_b[t];
	int j=0;
	for(;j<k;j++){
		v_o[j]=M[j][1];
		v_a[j]=M[j][2];
		v_b[j]=M[j][3];
	}
	qsort(v_o,sizeof(v_o),sizeof(int),ordina_ori);
}*/
medaglie* crea_squadra(char *sq){
	medaglie *p=malloc(sizeof(medaglie));
	p->nome=strdup(sq);
	p->ori=0;
	p->argenti=0;
	p->bronzi=0;
	p->next=NULL;
}
void display(medaglie *start){
	for(;start!=NULL;start=start->next){ /* Vai avanti fino all'ultimo nodo */
		printf("%s %i %i %i\n",start->nome, start->ori, start->argenti, start->bronzi);
	}
}
int main(){
	char nome_squadra[80];
	medaglie *start=NULL;
	medaglie *i=NULL;
	medaglie *next=NULL;
	puts("------------------------------");
	puts("Inserisci i dati di una squadra");
	puts("Nome nazione:");
	int t=0;
	for(;scanf("%79s",nome_squadra)==1;i=next){
		next=crea_squadra(nome_squadra);
		puts("ori vinti");
		scanf("%i",&(next->ori));
		puts("argenti vinti");
		scanf("%i",&(next->argenti));
		puts("bronzi vinti");
		scanf("%i",&(next->bronzi));
		/*printf("%i\n",next->ori);*/
		if(start==NULL)
			start=next;
		if(i!=NULL)
			i->next=next;
		t++;
		puts("------------------------------");
		puts("Inserisci i dati di una squadra");
		puts("Nome nazione:");
	}
	puts("-----------------------------------");
	puts("Elenco risultati");
	display(start);
	release(start);
	return 0;
}
