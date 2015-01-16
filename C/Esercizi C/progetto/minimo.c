#include<conta.h>
int minimo(int v[],int k){
	int i=0;
	int M=99;
	for(;i<k;i++){
		if(v[i]<=M)
			M=v[i];
	}
	return M;
}
