#include <stdio.h>
#include <math.h>
int main(){
	int a;
	int n=0;
	int somma=0;
	int media;
	while(1){
		puts("Inserisci un numero da tastiera: ");
		scanf("%i",&a);
		if (a!=0){
			somma=somma + a;
			n++;
			/* printf("%i",somma);
			printf("%i",n); */
		}else{
			break;
		}
	}
	media=(somma)/(n);
	printf("La media aritmetica dei numeri inseriti è %i\n",media);
	return 0;
}
