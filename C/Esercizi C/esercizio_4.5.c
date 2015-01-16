#include <stdio.h>
#include <math.h>
int main(){
	int N;
	int i;
	puts("Inserisci il numero limite: ");
	scanf("%i",&N);
	if (N>0){
		for (i=1;i<N+1;i++){
			printf("%f\n",pow(i,2));
		}
	}else{
		puts("Errore di input\n");
	}
	return 0;
}
