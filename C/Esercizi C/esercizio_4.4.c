#include <stdio.h>
#include <math.h>
int main(){
	int a;
	/*int b; */
	int mass;
	int mini;
	int N;
	puts("Inserisci il numero di valori da analizzare: ");
	scanf("%i",&N);
	int i;
	for(i=0;i<N;i++){
		printf("Inserisci il %i-mo numero:\n ",i+1);
		scanf("%i",&a);
		if (i==0){
			mass=a;
			mini=a;
		}else if((i!= 0)&&(a!=mass)&&(a!=mini)){
			if (mass<a)
				mass=a;
			if (mini>a)
				mini=a;
		}
	}
	printf("Il valore massimo è %i\n Il valore minimo è %i\n",mass,mini);
	return 0;
}
