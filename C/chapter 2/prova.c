#include <stdio.h>

/*int decresci_1(int A){
	A=A-1;
	return A;
}
int main(){
	int val=10;
	val=decresci_1(val);
	printf("Il nuovo valore della variabile val è %i\n", val);
	return 0;
}
Aggiorno la copia (A) o il valore originale (val) ? */

/*Esempio: Un array (una stringa è un array di caratteri) può essere usato come puntatore */

void message(char msg[]){
	printf("%s\n",msg);
	printf("La stringa è situata in %p\n",msg);
	printf("La stringa occupa %i bytes\n",sizeof(msg));
}
int main(){
	char mess[80];
	puts("Inserisci un messaggio:");
	fgets(mess,sizeof(mess),stdin);
	message(mess);
	return 0;
}
