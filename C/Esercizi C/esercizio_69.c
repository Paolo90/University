#include <stdio.h>
int fattoriale(int n){
	int F;
	if(n==1){
		F=1;
	}else{
		F=n*fattoriale(n-1);
	}
	return F;
}
int disposizioni(int n, int k){
	int D;
	if(n>=k){
		if(n==k){
			D=fattoriale(k);
		}else{
			D=n*disposizioni(n-1,k);
		}
	}else{
		printf("Errore di input\n");
		return 1;
	}
	return D;
}
int main(){
	int n;
	int k;
	puts("Inserisci n:");
	scanf("%i",&n);
	puts("Inserisci k:");
	scanf("%i",&k);
	puts("-------------");
	int D;
	D=disposizioni(n,k);
	printf("Il numero di disposizioni di %i elementi presi a gruppi di %i è %i\n",n,k,D);
	return 0;
}
