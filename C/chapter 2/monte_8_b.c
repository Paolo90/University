#include <stdio.h>
int main(){
	char cards[]={'J','Q','K'};
	char *choice=cards;
	char carta=cards[2];
	cards[2]=cards[1];
	cards[1]=cards[0];
	cards[0]=carta;
	cards[2]=cards[1];
	cards[1]=*choice; 
	puts(cards);
	return 0;
}
