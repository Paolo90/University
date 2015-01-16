#include <stdio.h>
void valore_assoluto(float *a){
	if (*a<0)
		*a=-(*a);
}
int main(){
	puts("Inserisci un numero: ");
	float a;
	scanf("%f",&a);
	valore_assoluto(&a);
	printf("Il modulo del numero inserito è %f\n",a);
	return 0;
}
