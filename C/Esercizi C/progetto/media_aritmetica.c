#include<conta.h>
float media_aritmetica(int v[], int k){
	int A=0;
	int i;
	for(;i<k;i++){
		A+=v[i];
	}
	return (((float)A)/((float)i));
}
