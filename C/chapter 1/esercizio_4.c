#include <stdio.h>
int main()
{
	int card = 1;
	if (card > 1) {
		card = card - 1; /*stesso difetto precedente */
		if (card < 7)
			puts("Small card");
	else
		puts("Ace!");
	}
	return 0;
}

/* il codice funziona cambia solo il modo di intendere uno statement. Non ha senso perché la condizione dell'if non vale e non stampa nulla però funziona tutto */
