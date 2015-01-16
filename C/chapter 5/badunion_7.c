#include <stdio.h>
typedef union {
	float weight;
	int count;
} cupcake;
int main(){
cupcake order = {2}; /*By mistake, the programmer has set the weight, not the count.*/
printf("Cupcakes quantity: %i\n", order.count); /*She set the weight, but she's reading the count.*/
return 0;
}
