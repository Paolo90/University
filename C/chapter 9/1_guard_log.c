#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include<stdio_ext.h>
char* now(){ /* Questa funzione restituisce una stringa contenente la data e l'ora correnti */
	time_t t;
	time (&t);
	return asctime(localtime (&t));
}
int main(){
	char cmd[120];
	char comment[80];
	fgets(comment,80,stdin);
	sprintf(cmd,"echo '%s %s'>>1_reports.log",comment,now());/*la funzione scrive il comando tra "" nella stringa cmd. I due %s vengono formattati da comment e now(). Tutto l'output è scritto nel file reports.log*/
	/*sprintf(cmd,"echo '' && ls / && echo ' %s'>>report.log",now());*/
	system(cmd);
	return 0;
}
