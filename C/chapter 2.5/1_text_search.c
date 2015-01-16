#include <stdio.h>
#include <string.h>
char tracks[][80] = { /*Mettiamo l'array di array all'inzio del codice così che sia usabile da tutte le funzioni che chiameremo in seguito*/
	"I left my heart in Harvard Med School",
	"Newark, Newark - a wonderful town",
	"Dancing with a Dork",
	"From here to maternity",
	"The girl from Iwo Jima",
};

void find_track(char search_for[]){ /*La funzione ha valore di ritorno void quindi non restituirà un valore. Questa funzione servirà nel main*/
	int i;
	for (i=0;i<5;i++){
		if (strstr(tracks[i],search_for)){
			printf("Track %i: '%s'\n",i,tracks[i]); /*Gli apicetti sono solo decorativi, non hanno alcun significato sintattico.*/
		}
	}
}
int main(){
	char search_for[80];
	printf("Search for: ");
	fgets(search_for,sizeof(search_for),stdin);
	find_track(search_for);
	return 0;
}
