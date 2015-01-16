#include <stdio.h>
int main(){
	char *cards="JQK"; /* Compila correttamente anche se scrivo scrivo char cards[]="JQK"; char *cards=cards;*/
	char a_card=cards[2];
	cards[2]=cards[1];
	cards[1]=cards[0];
	cards[2]=cards[1];
	cards[1]=a_card;
	puts(cards);
	return 0;
}
