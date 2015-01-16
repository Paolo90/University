#include <stdio.h>
#include <stdlib.h>
int main(){
	puts("Inserisci la lunghezza del vettore dinamico intero: ");
	int n;
	scanf("%i",&n);
/* Alloco spazio sull'heap per il vettore di lunghezza n */
	int *p = malloc(sizeof(int)*n);
/* Riempiamo questo vettore */	
	int i;
	int x;
	for(i=0;i<n;i++){
		printf("Inserisci la %i ma componente: ",i+1);
		scanf("%i",p+i);
		printf("%i\n",*(p+i)); /* se volevo mettere come secondo argomento p+i allora non usavo %i ma %p perché p+i è indirizzo */
	}
	free(p);
	return 0;
}
