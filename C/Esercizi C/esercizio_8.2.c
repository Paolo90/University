#include<stdio.h>
int ricerca(int v[],int N, int x){
	int i=0;
	int flag=0;
	while(flag==0){
		if(v[i]==x)
			flag=1;
		i++;
	}
	return flag;
}
int main(){
	int N;
	int flag=1;
	while(flag==1){
		puts("Inserisci la dimensione del vettore:");
		scanf("%i",&N);
		int v[N];
		int i;
		for(i=0;i<N;i++){
			printf("Inserisci la %i ma componente (intero): ",i+1);
			scanf("%i",&v[i]);
		}
		int x;
		puts("Inserisci un elemento intero da cercare:");
		scanf("%i",&x);
		int F=ricerca(v,N,x);
		if(F==0){
			puts("Corrispondenza non trovata");
		}else{
			puts("Corrispondenza trovata");
		}
		puts("Altra ricerca (y/n) ?");
		char ans[1];
		scanf("%s",ans);
		if(ans[0]=='n'){
			flag=0;
			puts("Ciao alla prossima");
		}
	}
	return 0;
}
