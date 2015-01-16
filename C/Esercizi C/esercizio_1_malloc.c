/* Scrivere una funzione che, dati in input due array di interi, restituisca il numero di elementi in comune dei due array. Si assuma che nessuno dei due array contenga al suo interno dei duplicati. Si fornisca inoltre una semplice funzione main() di prova */
#include <stdio.h>
#include <stdlib.h>
int elementi_comuni(int v[],int N, int w[], int M){
	int comune=0;
	int i; /* indice su v */
	int j; /* indice su w */
	for(i=0;i<N;i++){
		for(j=0;j<M;j++){
			if(v[i]==w[j]){
				comune++;
				printf("comune= %i, i=%i, j=%i\n",comune,i,j);
				break;
			}
		}
	}
	return comune;
}
int main(){
	int N; /* dim v */
	int M; /* dim w */
	puts("Inserisci la dimensione del primo vettore: ");
	scanf("%i",&N);
	puts("Inserisci la dimensione del secondo vettore: ");
	scanf("%i",&M);
	puts("------------------------------------------");
	int *p=malloc(N*sizeof(int)); /* v */
	int *q=malloc(M*sizeof(int)); /* w */
	int i;
	puts("Riempi il primo vettore: ");
	for(i=0;i<N;i++){
		scanf("%i",p+i);
	}
	puts("Riempi il secondo vettore:");
	for(i=0;i<M;i++){
		scanf("%i",q+i);
	}
	printf("Numero di elementi a comune = %i\n",elementi_comuni(p,N,q,M));
	free(p);
	free(q);
	return 0;
}
