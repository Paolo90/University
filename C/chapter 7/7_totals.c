#include <stdarg.h>
enum drink {
MUDSLIDE, FUZZY_NAVEL, MONKEY_GLAND, ZOMBIE
};
double price(enum drink d){
	switch(d) {
	case MUDSLIDE:
		return 6.79;
	case FUZZY_NAVEL:
		return 5.31;
	case MONKEY_GLAND:
		return 4.82;
	case ZOMBIE:
		return 5.89;
	}
}
double total(int args,...){
	va_list ap;
	va_start(ap, args);
	int i;
	double total=0;
	for (i=0; i<args; i++){
		total = total + price(va_arg(ap,enum drink /* va bene anche int */)); /*equivale a :  enum drink d = va_arg(ap, enum drink);  tot= tot + price(d) funziona anche con int perché i simboli degli enum sono legati a dei valori interi */
	}
	va_end(ap);
	return total;
}
int main(){
	printf("The total is: %.2f\n", total(3,MONKEY_GLAND, MUDSLIDE, FUZZY_NAVEL)); /* DEVE RESTITUIRE 16.9*/
	return 0;
}
