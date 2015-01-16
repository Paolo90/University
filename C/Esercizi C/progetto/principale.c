#include<stdio.h>
#include<conta.h>
int main(){
	puts("Inserisci la dimensione del vettore:");
	int d;
	scanf("%i",&d);
	int w[d];
	int i;
	for(i=0;i<d;i++){
		printf("Inserisci la componente %i-ma\n",i+1);
		scanf("%i",w+i);
	}
	int mass=massimo(w,d);
	int mini=minimo(w,d);
	float media=media_aritmetica(w,d);
	printf("Il massimo dell'array è: %i\n",mass);
	printf("Il minimo dell'array è: %i\n",mini);
	printf("La media aritmetica dell'array è: %3.2f\n",media);
	return 0;
}
