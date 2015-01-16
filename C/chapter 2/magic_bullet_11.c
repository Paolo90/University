/*Questa è una copia del file magic_bullet_10.c. Vediamo se sostituendo jimmy a masked_raider nelle righe 8,9,10,11,12 otteniamo lo stesso risultato. Il risultato è positivo, cioè otteniamo lo stesso risultato di magic_bullet_10.c . Stavolta è lecito usare un puntatore per modificare la stringa perché questo punta (cioè contiene l'indirizzo) del primo carattere di masked_raider che sta nello stack quindi è possibile modificare la stringa "Alive" facendola diventare "DEAD!" */
#include <stdio.h>
int main()
{
	char masked_raider[] = "Alive";
	char *jimmy = masked_raider; /* jimmy punta all'array masked raider, cioè contiene l'inidirizzo della prima lettera. jimmy non può essere modificato. Maskd_raider può essere modificato perché è definito attraverso un array. */
	printf("Masked raider is %s, Jimmy is %s\n", masked_raider, jimmy);
	jimmy[0] = 'D';
	jimmy[1] = 'E';
	jimmy[2] = 'A';
	jimmy[3] = 'D';
	jimmy[4] = '!';
	printf("Masked raider is %s, Jimmy is %s\n", masked_raider, jimmy);
	return 0;
}
