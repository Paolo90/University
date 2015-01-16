#include <stdio.h>
#include <math.h>
typedef struct{
	int numeratore;
	int denominatore;
}frazione;
int GCD(int a, int b){
	int r;
	r = a % b;             // operazione modulo //
	while(r != 0)          // ciclo di iterazione //
	{
		a = b;
	        b = r;
	        r = a % b;
	}
	printf("%i\n",b);
	return b;
}
int main(){
	puts("Inserisci il numeratore: ");
	int N;
	scanf("%i",&N);
	int D;
	puts("Inserisci il denominatore: ");
	scanf("%i",&D);
	if(N>D){
		int M=GCD(N,D);
		N=N/M;
		D=D/M;
	}else if(N<D){
		int M=GCD(D,N);
		N=N/M;
		D=D/M;
	}else
		printf("Numeratore e denominatore uguali. La frazione fa 1\n");
	printf("%i / %i\n",N,D);
	return 0;
}
