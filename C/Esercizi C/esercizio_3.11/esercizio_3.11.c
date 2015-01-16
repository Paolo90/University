#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include "eq_1_grado.h"
float delta(float a, float b, float c){
	float Delta;
	Delta=pow(b,2)-4*a*c;
	return Delta;
}
int main(){
	puts("Programma risoluzione equazioni di secondo grado della forma ax^2+bx+c=0\n");
	float a;
	float b;
	float c;
	float x;
	float y;
	puts("Inserisci a:");
	scanf("%f",&a);
	puts("Inserisci b:");
	scanf("%f",&b);
	puts("Inserisci c: ");
	scanf("%f",&c);
	float Delta=delta(a,b,c);
	float sqrt_delta=pow(Delta,1/2);
	if (a!=0){
		if (Delta <0){
			puts("Non esistono soluzioni reali\n");
			return 1;
		}else if (Delta==0){
			puts("Esiste una unica soluzione\n");
			x=-(b/(2*a));
			printf("La soluzione è x=%f\n",x);
		}else{
			puts("Due soluzioni reali e distinte\n");
			x=(-b+sqrt_delta)/(2*a);
			y=(-b-sqrt_delta)/(2*a);
			printf("Le soluzioni sono x=%f e y=%f\n",x,y);
		}
	}else{
		eq_1_grado(b,c);
	}
	return 0;
}
