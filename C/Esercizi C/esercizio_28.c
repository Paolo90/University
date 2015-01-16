#include<stdio.h>
#include<math.h>
int fattoriale(int n){
	int F;
	if(n==0){
		F=1;
	}else{
		F=n*fattoriale(n-1);
	}
	return F;
}
double nepero(int n){
	double N=0;
	int i;
	for(i=0;i<=n;i++){
		N+=1/((double)fattoriale(i));
	}
	return N;
}
int main(){
	puts("Inserisci n");
	int n;
	scanf("%i",&n);
	double N=nepero(n);
	printf("Il numero di nepero al passo %i è %f\n",n,N);
	return 0;
}
