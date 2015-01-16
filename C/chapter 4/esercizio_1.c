#include <stdio.h>
float total=0.0;
short count=0;
int tax_percent=6;
float add_with_tax(float f){
	float tax_rate=1+tax_percent/100.0; /* Metto 100.0 per fare la divisione tra numeri decimali. Se la lasciavo tra numeri interi veniva 0. Potevo anche usare il cast (float) su tax_percent */
	total = total + (f * tax_rate);
	count = count + 1;
	return total;
}
int main(){
	float val;
	printf("Price of item: ");
	while (scanf("%f", &val) == 1) {
		printf("Total so far: %.2f\n", add_with_tax(val)); /* %.2f indica un numero decimale con due sole cifre dopo la virgola */
		printf("Price of item: ");
	}
	printf("\nFinal total: %.2f\n", total);
	printf("Number of items: %hi\n", count);
	return 0;
}
