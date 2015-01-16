#include <stdio.h>
#include <math.h>
/* Esempio di funzione ricorsiva: il fattoriale */
int fattoriale (int n){
	int fatt;
	if(n<0){
		printf("Errore di Input: inserisci un numero non negativo\n");
	}else{
		if(n==0){
			fatt=1;
		}else{
			fatt=n*fattoriale(n-1);
		}
	}	
	return fatt;
}
int main(){
	int n;
	puts("Inserisci un numero intero non negativo: ");
	scanf("%i",&n);
	printf("Il fattoriale del numero inserito è %i\n",fattoriale(n));
	return 0;
}
