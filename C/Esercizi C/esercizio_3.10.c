#include <stdio.h>
int main(){
	float a;
	float b;
	float c;
	float max=a;
	puts("Inserisci il primo numero: ");
	scanf("%f",&a);
	puts("Inserisci il secondo numero: ");
	scanf("%f",&b);
	puts("Inserisci il terzo numero: ");
	scanf("%f",&c);
	if ((a>b)&&(a>c)){
		puts("Il massimo è il primo numero\n");
	}else if((a>b)&&(a<c)){
		puts("Il massimo è il terzo numero\n");
		max=c;
	}else if((a<b)&&(b<c)){
		puts("Il massimo è il terzo numero");
		max=c;
	}else if((a<b)&&(c<b)){
		puts("Il massimo è il secondo numero\n");
		max=b;
	}
	printf("Il massimo è %f\n", max);
	return 0;
}
