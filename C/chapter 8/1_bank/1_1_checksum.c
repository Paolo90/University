#include "1_1_checksum.h"
int checksum(char *message){
	int c=0;
	while (*message){
		c=c+c^(int)(*message);
		message++;
	}
	return c;
}
