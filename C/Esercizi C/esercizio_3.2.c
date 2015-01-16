#include <stdio.h>
int main(){
	float a;
	puts("Inserisci un numero: ");
	scanf("%f",&a);
	if (a>0){
		printf("Numero positivo\n");
	}else if (a<0){
		printf("Numero negativo\n");
	}else{
		printf("Numero Nullo\n");
	}
	return 0;
}
