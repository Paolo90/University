#include <stdio.h>
int main(){
	puts("Quante entrate ha il vettore? ");
	int N;
	scanf("%i",&N);
	int conta=0;
	int v[N];
	if(N>0){
		int a;
		puts("Inserisci le entrate del vettore: ");
		while(conta<N){
			scanf("%i",&a);
			v[conta]=a;
			conta++;
		}
	}else{
		puts("Errore di input\n");
		return 1;
	}
	int i;
	for(i=0;i<N;i++){
		int isto=0;
		printf("Elemento %i:",i+1);
		while(isto<v[i]){
			printf("*");
			isto++;
		}
		printf("*\n");
	}
	return 0;
}
