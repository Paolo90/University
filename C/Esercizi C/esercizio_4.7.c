#include <stdio.h>
#include <stdlib.h>
int main(){
	int N;
	puts("Specificare il numero di valori da inserire: ");
	scanf("%i",&N);
	int v[N];
	int i;
	int a;
	for (i=1;i<N+1;i++){ /* Riempimento del vettore */
		printf("Inserisci il %i-mo numero: ",i);
		scanf("%i",&a);
		*(v+i-1)=a;
	}
	i=1;
	int positivo=0;
	int negativo=0;
	int nullo=0;
	int pari=0;
	int dispari=0;
	int crescente=1;
	int decrescente=1;
	while(i<N+1){
		if (*(v+i-1)>0){
			positivo++;
		}else if (*(v+i-1)<0){
			negativo++;
		}else{
			nullo++;
		}
		if (v[i-1]%2==0){
			pari++;
		}else{
			dispari++;
		}
		if ((i>1)&&((crescente)||(decrescente))){
			if(v[i-1]>v[i-2]){
				decrescente=0;
			}else if(v[i-1]<v[i-2]){
				crescente=0;
			}else{
				crescente=0;
				decrescente=0;
			}
		}
		i++;	
	}
	printf("Ci sono %i valori positivi\n",positivo);
	printf("Ci sono %i valori negativi\n",negativo);
	printf("Ci sono %i valori nulli\n",nullo);
	printf("Ci sono %i valori pari\n",pari);
	printf("Ci sono %i valori dispari\n",dispari);
	if (crescente){
		printf("Successione crescente\n");
	}else if (decrescente){
		printf("Successione decrescente\n");
	}else{
		printf("Successione né crescente né decrescente\n");
	}
	return 0;
}
