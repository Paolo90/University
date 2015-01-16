#include <stdio.h>
int main(){
	/* char *stringa= "Ciao Paolo";
	printf("La stringa dice: %s\n",stringa);
	int x=4;
	int *t=&x;
	printf("x vive in %p\n", &x);
	printf("Il valore di x calcolato con il puntatore è %i\n",t);
	printf("Il valore di x calcolato con il puntatore è %i\n",*t); /* questa è la scrittura giusta */
	FILE *file_in=fopen("in.txt","r");
	int a;
	int b;
	int c;
	while(fscanf(file_in,"%i %i %i",&a,&b,&c)==3){
		puts("ciao");
	}
	fclose(file_in);
	return 0;
}
