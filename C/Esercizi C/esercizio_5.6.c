#include <stdio.h>
int main(){
	puts("Inserisci il numero delle entrate: ");
	int N;
	scanf("%i",&N);
	int i;
	int v[N];
	if(N>0){
		int a;
		puts("Inserisci le entrate del vettore: ");
		for(i=0;i<N;i++){
			scanf("%i",&a);
			v[i]=a;
		}	
	}else{
		puts("Errore di Input");
		return 1;
	}
	int w[N]; /* shift a destra */
	int z[N]; /* shift a sinistra */
	w[0]=0;
	z[0]=v[1];
	printf("%i",w[0]);
	for(i=1;i<N;i++){
		w[i]=v[i-1];
		printf("%i",w[i]);
	}
	printf("\n");
	printf("%i",z[0]);
	for(i=1;i<N;i++){
		if((i+1)<N){
			z[i]=v[i+1];
		}else{
			z[i]=0;
		}
		printf("%i",z[i]);
	}
	printf("\n");
	return 0;
}
