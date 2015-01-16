#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#define NULL 0
typedef struct island{
	char *name;
	char *opens;
	char *closes;
	struct island *next;
}island;
void display(island *start){
	island *i=start;
	for(;i!= NULL;i=i->next){
		printf("Name: %s\nOpen-Close: %s - %s\n",i->name, i->opens, i->closes);
	}
}
island* create(char *name){
	island *i = malloc(sizeof(island));
	i->name = strdup(name); /* name è il valore dell'array non un indirizzo perché sto usando una stringa */
	i->opens = "09:00";
	i->closes = "17:00";
	i->next = NULL;
	return i;
}
int main(){
	char name[80];
	puts("Enter the island name: ");
	fgets(name, 80, stdin);
	island *p_island0 = create(name);
	puts("Enter the second island name: ");
	fgets(name,80,stdin);
	island *p_island1=create(name); /* Le due isole condividono la stessa stringa name */
	p_island0->next=p_island1; /* Il salto va con gli indirizzi */
	display(p_island0); /* Crea la lista delle informazioni su ognuna delle isole visitate */
	return 0;
}
