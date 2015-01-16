#include <stdio.h>
void precedente_e_successivo(int a){
	printf("Il numero corrente è %i\n",a);
	printf("Il precedente è %i\n",a-1);
	printf("Il successivo è %i\n",a+1);
}
int main(){
	int a;
	puts("Inserisci un numero: ");
	scanf("%i",&a);
	precedente_e_successivo(a);
	return 0;
}
