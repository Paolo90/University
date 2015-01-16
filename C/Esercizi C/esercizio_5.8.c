#include <stdio.h>
int main(){
	puts("Inserisci la lunghezza del primo vettore: ");
	int M;
	scanf("%i",&M);
	puts("Inserisci la lunghezza del secondo vettore: ");
	int N;
	scanf("%i",&N);
	int i;
	int j;
	int a;
	int v[M];
	int w[N];
	int P=0;
	int S=N;
	int R=M;
	if ((N>0)&&(N<30)&&(M>0)&&(M<30)){
		for(i=0;i<M;i++){
			printf("Inserisci la %i ma entrata del primo vettore\n",i+1);
			scanf("%i",&a);
			v[i]=a;
		}
		for(j=0;j<N;j++){
			printf("Inserisci la %i ma entrata del secondo vettore\n",j+1);
			scanf("%i",&a);
			w[j]=a;
		}
/*Adesso compattiamo i vettori creati. Compatto w */
		for(i=1;i<N;i++){
			for(j=0;j<i;j++){
				if((w[j]==w[i])&&(S>1)){
					S--;
					break;
				}
			}
		}
/*Compatto v*/
		for(i=1;i<M;i++){
			for(j=0;j<i;j++){
				if((v[j]==v[i])&&(R>1)){
					R--;
					break;
				}
			}
		}
		printf("R=%i S=%i\n",R,S);
		int vv[R];
		int ww[S];
/*Adesso vogliamo mettere nel vettore compattato elementi che compaiono solo una volta presi dal vettore scelto*/ 
		int s;
		int ss=1;
		ww[0]=w[0];
		vv[0]=v[0];
		for(i=1;i<N;i++){
			s=0;
			for(j=0;j<i;j++){
				if(w[j]==w[i])
					s=1;
					break;
			}
			if(s==0)
				ww[ss]=w[i];
				ss=ss+1;
		}
		ss=1;
		for(i=1;i<M;i++){
			s=0;
			for(j=0;j<i;j++){
				if(v[j]==v[i])
					s=1;
					break;
			}
			if(s==0)
				vv[ss]=v[i];
				ss=ss+1;
		}
		/*for (i=0;i<R;i++){
			printf("%i",vv[i]);
		}
		puts("\n");
		for (i=0;i<S;i++){
			printf("%i\n",ww[i]);
		}
 Adesso i vettori sono compattati. Definisco la dimensione del vettore intersezione u */
		int cond;
		for(i=0;i<R;i++){
			cond=1;
			for(j=0;j<S;j++){
				if(ww[j]==vv[i]){
					P++;
					cond=0;

				}
				if(cond==0)
					break;
			}
		}
		printf("P=%i\n",P);
		int u[P];
		int t=0;
		for(i=0;i<R;i++){
			for(j=0;j<S;j++){
				if(ww[j]==vv[i]){
					u[t]=ww[j];
					t++;
				}
			}
		}
		puts("\n");
		if(P){
			puts("Il vettore intersezione è:");
			printf("u=");
			for(i=0;i<P-1;i++){
				printf("%i",u[i]);
			}
			printf("%i\n",u[P-1]);
		}else{
			puts("Intersezione vuota");
		}
	}
	return 0;
}
