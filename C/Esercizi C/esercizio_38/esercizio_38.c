#include <stdio.h>
#include <math.h>
#include <stdlib.h>
void visualizza_quadrato(int *v, int N){
	int i;
	for(i=0;i<N;i++){
		printf("%i\n",(int)pow(v[i],2));
	}
}
int main(){
	int N;
	puts("Inserisci la grandezza del vettore: ");
	scanf("%i",&N);
	puts("---------------------------------------");
	int *v=malloc(N*sizeof(int));
	int i=0;
	FILE *file_in=fopen("dati.txt","r");
	while((fscanf(file_in,"%i",v+i)==1)&&(i<N)){
		i++;
	}
	visualizza_quadrato(v,N);
	fclose(file_in);
	free(v);
	return 0;
}
