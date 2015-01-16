#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include<stdio_ext.h>
char* now(){
	time_t t;
	time (&t);
	return asctime(localtime (&t));
}
int main(){
	char cmd[120];
	char nome_file[100];
	puts("Inserisci il nome del file da copiare\n");
	scanf("%99s",nome_file);
	sprintf(cmd,"cp ~/Documents/%s ~/%s",nome_file,nome_file);
	system(cmd);
	return 0;
}
