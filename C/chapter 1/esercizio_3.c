#include <stdio.h>
int main()
{
	int card = 1;
	if (card > 1) /*Non vede l'annidamento degli if. Esegue solo il secondo if che lo pensa legato all'else*/
		card = card - 1;
		if (card < 7)
			puts("Small card");
	else {
		puts("Ace!");
	}
	return 0;
}

