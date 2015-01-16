#include <stdio.h>
#include <math.h>
#include "esercizio_3.6.h"
void eq_1_grado(float a, float b){
	if (a==0){
		if (b==0){
			printf("Equazione indeterminata\n");
		}else{
			printf("Equazione impossibile\n");
		}
	}else{
		float s= -(b/a);
		printf("Esiste la soluzione ed è %f\n",s);
	}
}
int main(){
	puts("Inserisci il primo numero: ");
	float a;
	scanf("%f",&a);
	puts("Inserisci il secondo numero: ");
	float b;
	scanf("%f",&b);
	eq_1_grado(a,b);
	return 0;
}
