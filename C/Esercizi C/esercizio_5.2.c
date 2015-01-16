#include <stdio.h>
int main(){
	int N;
	puts("Quante entrate ha il vettore? ");
	scanf("%i",&N);
	int v[N];
	int a;
	int conta=0;
	if (N>0){
		printf("Inserisci %i elementi\n",N);
		while(conta<N){
			scanf("%i",&a);
			v[conta]=a;
			conta++;
		}
	}
	int tutti_uguali=1;
	conta=0;
	while((tutti_uguali==1)&&(conta<N-1)){
		if(v[conta]==v[conta+1]){
			conta++;
		}else{
			puts("Incorrispondenza trovata\n");
			return 0;
		}
	}
	puts("Il vettore è costituito di elementi tutti uguali\n");
	return 0;
}
