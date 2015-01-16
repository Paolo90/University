/*
* Program to evaluate face values.
* Released under the Vegas Public License.
* (c)2014 The College Blackjack Team.
*/
#include <stdio.h>
#include <stdlib.h>
int main()
{
	char card_name[3]; /*crea una stringa di tipo carattere con 2 entrate ... vedere sul quaderno il perché di questa sintassi*/
	puts("Enter the card_name: "); /*stampa a video questo messaggio*/
	scanf("%2s",card_name); /*legge iprimi due caratteri inseriti e li mette dentro la variabile card_name */
	int val =0;
	if (card_name[0]=='K'){ /*ATTENZIONE 'K' è diverso da "K" */
		val=10;
	}else if (card_name[0]=='Q'){
		val=10;
	}else if (card_name[0]=='J'){
		val=10;
	}else if (card_name[0]=='A'){
		val=11;
	}else {
		val=atoi(card_name); /* converte il testo in un numero */
	}
	printf("The card name is %i\n", val);
	return 0; /* restituisce 0 se il programma funziona */
}
