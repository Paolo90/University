#include <stdio.h>
int main(){
	char cards[]="JQK";
	char a_card=cards[2]; /*cards[2]=K*/
	cards[2]=cards[1]; /*cards[2]=Q*/
	cards[1]=cards[0]; /*cards[1]=J*/
	cards[0]=cards[2]; /*cards[0]=Q*/
	cards[2]=cards[1]; /*cards[2]=J*/
	cards[1]=a_card; /*cards[1]=K*/
	puts(cards); /*Risultato=QKJ*/
	return 0;
}
