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
	int test_c=1;
	int test_d=1;
	conta=0;
	while(((test_c)||(test_d))&&(conta<N-1)){
		if(v[conta]<=v[conta+1])
			test_d=0;
		if(v[conta]>=v[conta+1])
			test_c=0;
		conta++;
	}
	if((test_c==0)&&(test_d==0)){
		puts("Successione né crescente né decrescente");
	}else if(test_c){
 		puts("Successione crescente\n");
	}else{
		puts("Successione decrescente\n");
	}
	return 0;
}
