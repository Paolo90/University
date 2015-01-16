#include <stdio.h>
int main(){
	puts("Inserisci il numero delle entrate: ");
	int N;
	scanf("%i",&N);
	int i;
	int j;
	int v[N];
	if((N<20)&&(N>0)){
		int a;
		puts("Inserisci le entrate del vettore: ");
		for(i=0;i<N;i++){
			scanf("%i",&a);
			v[i]=a;
		}	
	}else{
		puts("Errore di Input: il numero delle entrate deve essere maggiore di 0 e minore di 20");
		return 1;
	}
	int M=N;
	for(i=0;i<N;i++){
		if(i==0){
			if(v[i]==0){
				M--;
			}
		}else{
			int cond=0;
			for(j=0;j<i;j++){
				if(v[j]==v[i]){
					cond=1;
				}
			}
			if((v[i]==0)||(cond)){
				M--;
			}
		}
	}
	printf("\n");
	printf("Il vettore compattato è:\n");
	if(M>0){
		int w[M];
		w[0]=v[0];
		printf("%i\n",w[0]);
		int t=1;
		int cond=1;
		for(i=1;i<N;i++){
			for(j=0;j<i;j++){
				if(v[i]==v[j]){
					cond=0;
				}
			}
			if((cond)&&(v[i]!=0)){
				w[t]=v[i];
				printf("%i\n",w[t]);
				t++;
			}
		}
	}else{
		puts("Vettore ridondante. La compattazione si riduce al primo elemento");
		printf("%i",v[0]);
		return 0;
	}
	return 0;
}
