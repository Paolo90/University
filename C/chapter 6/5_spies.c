#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define NULL 0
typedef struct node {
	char *question;
	struct node *no;
	struct node *yes;
} node;
int yes_no(char *question){
	char answer[3];
	printf("%s? (y/n): ", question);
	fgets(answer, 3, stdin);
	return answer[0] == 'y'; /* se scrivo 'y' da 1 (vero), se scrivo 'n' da 0 (falso)*/
}
node* create(char *question){
	node *n = malloc(sizeof(node));
	n->question = strdup(question);
	n->no = NULL;
	n->yes = NULL;
	return n; /* Ritorna un indirizzo */
}
void release(node *n){
	if (n) {
		if (n->no)
			release(n->no); /* giusto. no punta a uno struct */
		if (n->yes)
			release(n->yes); /* giusto. yes punta a uno struct*/
		if (n->question)
			free(n->question);
		free(n);
		}
}
int main(){
	char question[80];
	char suspect[20];
	node *start_node = create("Does suspect have a mustache");
	start_node->no = create("Loretta Barnsworth"); /* Il report dice che è stato lasciato questo pezzo di codice. Questo è un indirizzo */
	start_node->yes = create("Vinny the Spoon"); /* Questo è un indirizzo */
	node *current;
	do {
		current = start_node; /* Nodo di partenza */
		while (1) {
			if (yes_no(current->question)){ /* In questo punto si fanno le domande */
				if (current->yes) {
					current = current->yes; /*Mi sposto sul nodo del sì*/
				} else {
					printf("SUSPECT IDENTIFIED\n");
					break; /* Mi fa uscire da while(1) */
				}
			} else if (current->no) { /* Condizione esclusiva. Se rispondo no mi chiede se è il sospettato del nodo NO */
				current = current->no; /* Mi sposto sul nodo del no. Devo riloopare e guardare il campo question di questo struct */
			} else {
		/* Make the yes-node the new suspect name */
				printf("Who's the suspect? ");
				fgets(suspect, 20, stdin);
				node *yes_node = create(suspect);
				current->yes = yes_node; /* Mette a si il nome del nuovo sospetto*/
		/* Make the no-node a copy of this question */
				node *no_node = create(current->question); /* Prima devo liberare l'heap dove sta la domanda precendente */
				current->no = no_node; /* mette a no il nome che c'è dentro il campo question dello struct che vive all'indirizzo current*/
		/* Then replace this question with the new question */
				printf("Give me a question that is TRUE for %s but not for %s? ", suspect,current->question);
				fgets(question, 80, stdin);
				free(current->question); /* libero la memoria occupata dal nome in question (se non lo facessi sarebbero guai)*/
				current->question = strdup(question); /* Nello stesso spazio di memoria dove c'era il nome precedente ci metto la nuova domanda da fare */
				break;
			}
		}
	} while(yes_no("Run again")); /* associato al do */
	release(start_node);
	return 0;
}
