#include <stdio.h>
void fortune_cookie(char msg[])
{ /*non c'è nessuno spazio tra le due quadre */
	printf("Read message: %s\n", msg);
	printf("msg occupies %i bytes\n",sizeof(msg));
}
int main(){
	char quote[] = "Cookies make you fat";
	fortune_cookie(quote);
	return 0;
}
