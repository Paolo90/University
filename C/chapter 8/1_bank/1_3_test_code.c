#include <stdio.h>
#include "1_2_encrypt.h"
#include "1_1_checksum.h"
int main(){
	char s[] = "Speak friend and enter";
	encrypt(s);
	printf("Encrypted to '%s'\n", s);
	printf("Checksum is %i\n", checksum(s)); /* Darà un certo risultato */
	encrypt(s);
	printf("Decrypted back to '%s'\n", s);
	printf("Checksum is %i\n", checksum(s)); /* Darà un risultato diverso perché la stringa è stata modificata di nuovo */
	return 0;
}
