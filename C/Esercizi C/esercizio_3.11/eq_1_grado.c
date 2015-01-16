#include <stdio.h>
#include "eq_1_grado.h"
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
