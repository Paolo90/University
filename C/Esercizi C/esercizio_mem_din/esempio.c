#include<stdio.h>
#include<stdlib.h>
#include<stdio_ext.h>
int *calloC(int n){
	int *p=calloc(n,sizeof(int));
	return p;
}
int *malloC(int n){
	int *p=malloc(n*sizeof(int));
	return p;
}
int main(){
	int n;
	int dec;
	puts("Inserisci la dimensione dell'array");
	scanf("%i",&n);
	puts("Inserisci 1 se vuoi usare malloc, 2 se vuoi usare calloc");
	scanf("%i",&dec);
	int *p;
	switch(dec){
	case 1:
		p=malloC(n);
		break;
	case 2:
		p=calloC(n);
		break;
	default:
		fprintf(stderr,"Errore di input. Il programma termina\n");
	return 1;
	}
	char answ;
	int i;
	for(i=0;i<n;i++){
		printf("%i\n",*(p+i));
	}
	puts("Vuoi ridimensionare l'array?");
	__fpurge(stdin);
	scanf("%c",&answ);
	if(answ=='y'){
		puts("Inserisci la nuova dimensione");
		scanf("%i",&n);
		int *q=realloc(p,n);
		p=q;
	}
	for(i=0;i<n;i++){
		printf("%i\n",*(p+i));
	}
	puts("--------------------------");
	puts("Riempi il vettore");
	__fpurge(stdin);
	for(i=0;i<n;i++){
		scanf("%i",p+i);
	}
	for(i=0;i<n;i++){
		printf("%i\n",*(p+i));
	} 
	free(p);
	return 0;
}
