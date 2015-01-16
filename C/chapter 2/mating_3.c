#include <stdio.h>
int main(){
	int contestants[]={1,2,3}; /*vettore numerico */
	int *choice=contestants; /*definisco la variabile pointer *choice ricordando che int address_of_x=&x; choice è l'indirizzo del vettore contestants*/
	contestants[0]=2;
	contestants[1]=contestants[0];
	contestants[2]= *choice; /*legge il valore contenuto nell'indirizzo choice */
	printf("I'm going to pick contestant number %i\n",contestants[2]); /*contestants[2] è intero mentre contestants è un array di interi */
	return 0;
}
