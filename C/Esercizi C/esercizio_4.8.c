#include <stdio.h>
int main(){
	puts("Inserisci un numero N: ");
	int N;
	scanf("%i",&N);
	int v[N];
	int i;
	int cond=0;
	v[0]=1;
	v[N-1]=N;
	if (N>3){ /* Posso trovare numeri non primi da 4 incluso in poi*/
		printf("I divisiori di %i sono:\n",N);
		printf("%i\n",v[N-1]);
		printf("%i\n",v[0]);
		for(i=2;i<N;i++){ /* Riempimento del vettore v */
			if (N%i==0)
				(i-1)[v]=i;
				cond=1;
			if (*(v+i-1)>0)
				printf("%i\n",v[i-1]);
		}
		if (cond==0)
			printf("Numero Primo\n");
	}else{
		printf("Numero Primo\n");
	}
	return 0;
}
