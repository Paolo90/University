#include <stdio.h>
#include <math.h>
void classifica_triangolo(float a, float b, float c){
	if ((a==b)&&(b==c))
		printf("Triangolo equilatero\n");
	else if ((a==b)||(b==c)||(c==a))
		printf("Triangolo isoscele\n");
	else
		printf("Triangolo scaleno\n");
}
void test_rettangolo(float a, float b, float c){
	if((pow(c,2)==pow(a,2)+pow(b,2))||(pow(a,2)==pow(b,2)+pow(c,2))||(pow(b,2)==pow(c,2)+pow(a,2)))
		printf("Triangolo rettangolo\n");
	else
		printf("Triangolo NON rettangolo\n");
}
int main(){
	float a;
	float b;
	float c;
	puts("Inserisci il valore di a: ");
	scanf("%f",&a);
	puts("Inserisci il valore di b: ");
	scanf("%f",&b);
	puts("Inserisci il valore di c: ");
	scanf("%f",&c);
	classifica_triangolo(a,b,c);
	test_rettangolo(a,b,c);
	return 0;
}
