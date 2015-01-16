#include <stdio.h>
int main(){
	float A;
	float B;
	puts("Inserisci il primo numero: ");
	scanf("%f",&A);
	puts("Inserisci il secondo numero: ");
	scanf("%f",&B);
	if (B!=0){
		printf("%f\n",A+B);
		printf("%f\n",A-B);
		printf("%f\n",A*B);
		printf("%f\n",(float)(A/B));
		return 0;
	}else{
		printf("Errore di input: il secondo numero deve essere diverso da 0");
		return 2;
	}
}
