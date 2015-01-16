#include <stdio.h>
#include <math.h>
int main(){
	float D;
	float area_quadrato;
	float area_equilatero;
	float area_cerchio;
	float pi=3.14;
	puts("Inserisci un numero D: ");
	scanf("%f",&D);
	area_quadrato=pow(D,2);
	area_equilatero=(D/2)*(D*sqrt(3)/2);
	area_cerchio=pi*pow(D/2,2);
	printf("L'area del quadrato di lato D è %f\n",area_quadrato);
	printf("L'area del triangolo equilatero di lato D è %f\n",area_equilatero);
	printf("L'area del cerchio di diametro D è %f\n",area_cerchio);
	return 0;
}
