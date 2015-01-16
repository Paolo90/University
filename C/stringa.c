#include <string.h>
#include <stdio.h>
#include <stdlib.h>
int main(){
	/*char *string_1="Abo";
	char *string_2="Def";
	char prova[4];
	prova=string_1;
	printf("%s\n",prova);*/
	int v[5];
	int i;
	for(i=0;i<5;i++){
		scanf("%i",&(*(v+i)));
	}
	puts("");
	for(i=0;i<5;i++){
		printf("%i\n",*(v+i));
	}
	return 0;
}
