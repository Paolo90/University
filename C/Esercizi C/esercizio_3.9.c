#include <stdio.h>
int main(){
	float a;
	float b;
	puts("Inserisci il primo numero: ");
	scanf("%f",&a);
	puts("Inserisci il secondo numero: ");
	scanf("%f",&b);
	float max=a;
	if (b>a){
		max=b;
		printf("Il secondo valore inserito è il massimo\n");
	}else if(a>b){
		printf("Il primo numero inserito è il massimo\n");
	}else{
		printf("I due numeri sono uguali\n");
		return 0;
	}
	printf("Il valore massimo è %f\n",max);
	return 0;
}
