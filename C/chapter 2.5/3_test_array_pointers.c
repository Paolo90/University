#include <string.h>
#include <stdio.h>
int main(){
	char *names_for_dog[]={
		"Bowser",
		"Bonza",
		"Snodgrass",
		"Cecio",
		"Clara",
		"Nuvola"
	};
	puts(names_for_dog[3]);
	printf("%c\n",names_for_dog[1][2]);
	return 0;
}
