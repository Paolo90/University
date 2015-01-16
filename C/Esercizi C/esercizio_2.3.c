#include <stdio.h>
float media_aritmetica(float a, float b){
	float m=(a+b)/2;
	return m;
}
int main(){
	float a;
	float b;
	puts("Inserisci il primo numero: ");
	scanf("%f",&a);
	puts("Inserisci il secondo numero: ");
	scanf("%f",&b);
	float m;
	m=media_aritmetica(a,b);
	printf("La media aritmetica di %f e %f è %f\n",a,b,m);
	return 0;
}
