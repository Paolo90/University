/* Scrivere un programma che, dato un file di testo coord.txt contenente delle coordinate, prenda tutte quelle del quadrato [-3,3]x[-3,3] e le scambi di posto. Ad esempio (2,3)--->(3,2). Le coordinate scambiate di posto devono essere scritte su un file reverse_coord.txt*/
#include<stdio.h>
#include<stdlib.h>
int main(){
	float x;
	float y;
	while(scanf("%f %f",&x,&y)==2){ /*finché scanf legge un gruppo di due elementi*/
		if(((x>=-3)&&(x<=3))&&((y>=-3)&&(y<=3))) /* se gli elementi stanno nel quadrato */
			printf("%f %f\n",x,y); /* scrivili sullo standard output*/
	}
	return 0;
}
