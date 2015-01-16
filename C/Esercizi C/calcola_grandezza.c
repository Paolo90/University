#include<stdio.h>
int main(){
	printf("Gli interi(int) sono grandi %i bytes\n",sizeof(int));
	printf("Gli interi(long) sono grandi %i bytes\n",sizeof(long));
	printf("Gli interi(short) sono grandi %hi bytes\n",sizeof(short));
	printf("I numeri a virgola mobile (float) sono grandi %i bytes\n",sizeof(float));
	printf("I numeri a virgola mobile (double) sono grandi %i bytes\n",sizeof(double));
	return 0;
}
