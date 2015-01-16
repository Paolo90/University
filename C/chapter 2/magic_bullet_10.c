#include <stdio.h>
int main()
{
	char masked_raider[] = "Alive";
	char *jimmy = masked_raider; /* jimmy punta all'array masked raider, cioè contiene l'inidirizzo della prima lettera. jimmy non può essere modificato. Maskd_raider può essere modificato perché è definito attraverso un array. */
	printf("Masked raider is %s, Jimmy is %s\n", masked_raider, jimmy);
	masked_raider[0] = 'D';
	masked_raider[1] = 'E';
	masked_raider[2] = 'A';
	masked_raider[3] = 'D';
	masked_raider[4] = '!';
	printf("Masked raider is %s, Jimmy is %s\n", masked_raider, jimmy);
	return 0;
}
