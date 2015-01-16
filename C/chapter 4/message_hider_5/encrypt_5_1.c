#include "encrypt_5_1.h"
void encrypt(char *message){
	while(*message){
		*message=*message ^ 31;
		message++;
	}
}
