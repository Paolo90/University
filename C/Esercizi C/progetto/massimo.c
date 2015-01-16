#include<conta.h>
int massimo(int v[],int k){
	int i=0;
	int M=0;
	for(;i<k;i++){
		if(v[i]>=M)
			M=v[i];
	}
	return M;
}
