#include <stdio.h>
#include <string.h>
#include <stdlib.h>
/* Questa funzione ordina in modo crescente una lista di numeri interi */
int compare_scores(void *score_a, void *score_b){
	int a=*(int*)score_a;
	int b=*(int*)score_b;
	return a-b;
}
/*Questa funzione compara in ordine decrescente una lista di numeri interi*/
int compare_scores_desc(void *score_a, void *score_b){
	int a= *(int*)score_a;
	int b= *(int*)score_b;
	return (-(a-b));
}
typedef struct{
	int width;
	int height;
}rectangle;
int compare_areas(const void *a, const void *b){ /* passo come parametri gli indirizzi dei rettangoli*/
	rectangle *R_1= (rectangle*)a;
	rectangle *R_2= (rectangle*)b; /* dopo l'= ci vuole l'indirizzo di qualcosa */
	int h_1= R_1->height;
	int w_1= R_1->width;
	int h_2= R_2->height;
	int w_2= R_2->width;
	int A_1= h_1*w_1;
	int A_2= h_2*w_2;
	return A_1-A_2;
}
int compare_names(const void *a, const void *b){ /* a e b sono gli indirizzi di due stringhe */
	char **sa=(char**)a;
	char **sb=(char**)b;
	return strcmp(*sa,*sb); /* *sa e *sb sono il contenuto dell'indirizzo di una stringa, cioè sono l'indirizzo del primo carattere della stringa a cui corrispondono*/
}	
int compare_areas_desc(const void *a, const void *b){
	return (-compare_areas(a,b));
}
int compare_names_desc(const void *a, const void *b){
	return compare_names(b,a); /* è equivalente alla forma sopra */
}
int main(){
	int scores[] = {543,323,32,554,11,3,112};
	int i;
	qsort(scores, 7, sizeof(int), compare_scores_desc);
	puts("These are the scores in order:");
	for(i=0;i<7;i++){
		printf("Score = %i\n", scores[i]);
	}
	char *names[] = {"Karen", "Mark", "Brett", "Molly"};
	qsort(names, 4, sizeof(char*), compare_names); /*Un array di nomi è solo un array di puntatori a  caratteri, cioè un array di indirizzi. sizeof deve valutare una stringa, cioè un puntatore a un carattere quindi char*  */
	puts("Tese are the names in order: ");
	for (i = 0; i < 4; i++) {
		printf("Name= %s\n",names[i]);
	}
	return 0;
}
