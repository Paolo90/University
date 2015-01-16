#include <stdlib.h>
#include <stdio.h>
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
island* create(char *name){ /* island* è un general purpose pointer, cioè è il risultato di malloc() */
	island *i = malloc(sizeof(island));
	i->name = name;
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
	display(p_island0);
	puts("Enter the second island name: ");
	fgets(name,80,stdin);
	island *p_island1=create(name); /* Le due isole condividono la stessa stringa name */
	p_island0->next=p_island1; /* Il salto va con gli indirizzi */
	display(p_island0); /* quando la richiamo name = secondo_nome_inserito_da_tastiera. E' come lanciare display(create(name)) dove name è aggiornato.... non è più il primo nome ma è il secondo */
	display(p_island1);
	printf("La prima isola è scomparsa\n");
	return 0;
}
