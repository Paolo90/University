#include <stdio.h>
int main(){
	int v[30];
	int a;
	int conta=0;
	int N;
	printf("Quante entrate ha il vettore? ");
	scanf("%i",&N);
	if ((N>0)&&(N<31)){
		while(conta<=N-1){
			printf("Inserisci il %i mo elemento\n",conta+1);
			scanf("%i",&a);
			v[conta]=a;
			conta++;
		}
	}
	int cerca;
	puts("Inserisci l'elemento da cercare: ");
	scanf("%i",&cerca);
	int i;
	for(i=0;i<conta-1/*N-1*/;i++){ /* passa in rassegna tutti gli elementi del vettore */
		if(v[i]==cerca){
			printf("Il valore %i appartiene al vettore\n",cerca);
		}else{
			printf("Il valore %i non appartiene al vettore\n",cerca);
			return 0;
		}
	}
	return 0;
}
