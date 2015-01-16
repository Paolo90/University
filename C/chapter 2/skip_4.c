void skip(char *msg) /*sto puntando a una cella di memoria contenente un  carattere. La funzione skip vuole come argomento un indirizzo */
{
	puts(msg+6);	/*stampa dal 7-mo carattere in poi   */
}
int main(){ /*sul libro non chiama il main() */
	char *msg_from_amy="Don't call me"; /*   msg_from_amy è l'indirizzo del primo carattere della stringa "Don't call me" */
	skip(msg_from_amy);
	return 0;
}
