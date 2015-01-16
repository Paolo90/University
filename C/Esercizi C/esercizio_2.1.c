#include <stdio.h>
void somma(int a,int b){
	int s=a+b;
	printf("La somma è %i\n",s);
}
int main(){
	int a;
	int b;
	puts("Inserisci il primo numero: ");
	scanf("%i",&a);
	puts("Inserisci il secondo numero: ");
	scanf("%i",&b);
	somma(a,b);
	return 0;
}
