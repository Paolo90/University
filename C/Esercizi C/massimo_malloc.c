#include<stdio.h>
#include<stdlib.h>
typedef struct Vettore{
	int componente;
	struct Vettore *next;
}vettore;
vettore* crea(int k){
	vettore *p=malloc(sizeof(vettore));
	p->componente=k;
	p->next=NULL;
	return p;
}
int massimo(vettore *start){
	int M=0;
	vettore *i;
	vettore *next=NULL;
	for(i=start;i!=NULL;i=next){
		if(i->componente >= M)
			M=i->componente;
		next=i->next;
	}
	return M;
}
void release(vettore *start){
	vettore *i;
	vettore *next=NULL;
	for(i=start;i!=NULL;i=next){
		next=i->next;
		free(i);
	}
}
int main(){
	vettore *start=NULL;
	vettore *i=NULL;
	vettore *next=NULL;
	int k;
	puts("Inserisci un numero intero:");
	for(;scanf("%i",&k)==1;i=next){
		next=crea(k);
		if(start==NULL)
			start=next;
		if(i!=NULL)
			i->next=next;
		puts("Inserisci un numero intero:");
	}
	int N=massimo(start);
	printf("Il massimo è %i\n",N);
	release(start);
	return 0;
}
