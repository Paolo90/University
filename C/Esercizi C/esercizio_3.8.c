#include <stdio.h>
int main(){
	int operazione;
	int condizione=1;
	float a;
	float b;
	while (condizione==1){
		puts("Premi il tasto numerico relativo all'operazione da compiere\n 1. Addizione\n 2. Sottrazione\n 3. Moltiplicazione\n 4. Divisione\n 5. Esci dal programma\n");
		scanf("%i",&operazione);
		switch (operazione){
		case 1:
			puts("Inserisci il primo addendo: ");
			scanf("%f",&a);
			puts("Inserisci il secondo addendo: ");
			scanf("%f",&b);
			printf("La somma è %f\n",a+b);
			continue;
		case 2:
			printf("Inserisci il minuendo: ");
			scanf("%f",&a);
			puts("Inserisci il sottraendo: ");
			scanf("%f",&b);
			if ((a>b)||(a==b)){
				printf("La differenza è %f\n",a-b);
				continue;
			}else{
				printf("Errore di input: il minuendo non deve essere più piccolo del sottraendo\n");
				continue;
			}
		case 3:
			puts("Inserisci il primo fattore: ");
			scanf("%f",&a);
			puts("Inserisci il secondo fattore: ");
			scanf("%f",&b);
			printf("Il prodotto è %f\n",a*b);
			continue;
		case 4:
			puts("Inserisci il dividendo: ");
			scanf("%f",&a);
			puts("Inserisci il divisore: ");
			scanf("%f",&b);
			if (b){
				printf("Il rapporto è %f\n",a/b);
				continue;
			}else{
				printf("Errore di input: il divisore deve essere diverso da zero\n");
				continue;
			}
		default:
			printf("Alla prossima !!!\n");
			condizione=0;
			break;
		}
	}
	return 0;
}
