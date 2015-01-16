#include <stdio.h>
#include <string.h>
void print_reverse(char *s){
	size_t len=strlen(s); /* size_t è un tipo di dato che immagazzina la grandezza di qualcosa*/
	char *t=s+len-1;
	while(t>=s){
		printf("%c",*t); /*Mi interessa il contenuto quando uso %c */
		t--;
	}
	/*printf("\n");
	 printf("Reverse string: %s\n",t); non va bene perché t è una variabile puntatore non una variabile array */
}
int main(){
	puts("Inserisci una stringa: ");
	char s[21];
	fgets(s,sizeof(s),stdin);
	print_reverse(s);
	printf("\n");
	return 0;
}
