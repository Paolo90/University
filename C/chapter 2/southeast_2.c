#include <stdio.h>
void go_south_east(int *lat, int *lon){ /* lat è una variabile di tipo puntatore a intero, ovvero lat contiene l'indirizzo di memoria di una cella che contiene un intero. *lat invece è la variabile che sta all'indirizzo scritto dentro lat, cioè è il valore che gli è stato passato*/
	*lat=*lat-1; /* legge e sostituisce (2+3) il vecchio valore contenuto a quell'indirizzo di memoria potevo usare una variabile intermedia per mostrare il passaggio dalla fase di lettura a quella di scrittura*/
	*lon=*lon+1;
}
int main(){
	int latitude=32;
	int longitude=-64;
	go_south_east(&latitude, &longitude);
	printf("Avast! Now at [%i,%i]\n", latitude, longitude);
	return 0;
}
