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
void release(island *start){
	island *i=start;
	island *next=NULL;
	next=i->next;
	free(i->name);
	free(i); /* Libero dal più piccolo al più grande */
}
int main(){
	char name[80];
	island *start = NULL;
	island *i = NULL;
	island *next = NULL;
	for(;fgets(name,sizeof(name),stdin)!=NULL;i=next){
		next=create(name);
		if(start==NULL){
			start=next; /* Indirizzo della prima isola */
		}
		if(i!=NULL){
			i->next=next; /* Aggiorno gli indirizzi di tutte le isole successive che diventano quindi noti e posso usare la riga 28 */
		}
	}
	display(start);
	release(start);
	return 0;
}
