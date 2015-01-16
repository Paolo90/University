#include <stdio.h>
#include <math.h>
int main(){
	int A;
	int B;
	puts("Inserisci il valore di A: ");
	scanf("%i",&A);
	puts("Inserisci il valore di B: ");
	scanf("%i",&B);
	if (B>0)
		printf("B è positivo\n");
	else
		printf("B è negativo\n");
	if (A%2==0) /* a%2 vuol dire a mod2 */
		printf("A è pari\n");
	else
		printf("A è dispari\n");
	printf("La somma di A e B è %i\n",A+B);
	int s=A+B;
	int q=0;
	if (s < A-B){
		s=A-B;
		q=1;
	}
	if (s < -A+B){
		s=-A+B;
		q=2;
	}
	if (s < -A-B){
		s=-A-B;
		q=3;
	}
	if (q==0){
		printf("La configurazione ottimale è ++\n");
	}else if (q==1){
		printf("La configurazione ottimale è +-\n");
	}else if (q==2){
		printf("La configurazione ottimale è -+\n");
	}else if (q==3){
		printf("La configurazione ottimale è --\n");
	}
	printf("Il valore massimo è %i\n",s);
	return 0;
}
