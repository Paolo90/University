#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int potenza(int a, int b){
	int i;
	int power=1;
	for(i=0;i<b;i++){
		power=power*a;
	}
	return power;
}
int main(){
	int N;
	puts("Inserisci il numero dei bit occupati dal numero: ");
	scanf("%i",&N);
	puts("Inserisci le cifre del numero binario come se lo scrivessi da destra a sinistra\n");
	int i;
	int somma;
	int bit;
	int Potenza;
	puts("Inserisci il primo bit: ");
	scanf("%i",&bit);
	if ((bit==0)||(bit==1)){
		somma=bit;
		for (i=1;i<N;i++){
			Potenza=potenza(2,i);
			scanf("%i",&bit);
			if ((bit==0)||(bit==1)){
				somma=somma+(bit*Potenza);
			}else{
				printf("Errore di input: inserisci solo 0 o 1\n");
				return 1;
			}
		}
		printf("Il numero decimale è %i\n",somma);
	}else{
		printf("Errore di input: inserisci solo 0 o 1\n");
		return 1;
	}
	return 0;
}
