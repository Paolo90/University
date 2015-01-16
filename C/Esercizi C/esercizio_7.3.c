#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include<stdio_ext.h>
typedef struct{
	char nome[40];
	char tel[20];
}r_t;
/*Limite numeri telefonici*/
int L=100;
int confronta(const void* a, const void* b){
	r_t* sa = (r_t*)a;
	r_t* sb = (r_t*)b;
	return (strcmp(sa->nome,sb->nome));
}
int main(){
	r_t v[100]; /*vettore rappresentante la rubrica telefonica*/
	int t;
	char buffer[40];
	int i=0;
	int j=0;
	char telefono[20];
	while(1){
		puts("Specificare un'operazione");
		puts("1- Aggiungi nuova voce in rubrica");
		puts("2- Ricerca esatta per nome");
		puts("3- Ricerca esatta per numero");
		puts("4- Stampa l'intera rubrica");
		puts("0- Esci dal programma");
		scanf("%i[^\n]",&t);
		switch(t){
		case 0:
			puts("Sto uscendo dal programma");
			/*sleep(5);*/
			return 0;
		case 1:
			for(;i<L;i++){
				printf("Inserisci il nome: ");
				__fpurge(stdin);
				fgets(v[i].nome, sizeof(v[i].nome), stdin);
				printf("Inserisci il numero telefonico: ");
				fflush(stdin);
				fgets(v[i].tel, sizeof(v[i].tel), stdin);
				printf("%s\n %s\n",v[i].nome, v[i].tel);
				puts("Aggiungere un'altro numero?");
				scanf("%1s",buffer);
				fflush(stdin);
				if((buffer[0]=='n')||(buffer[0]=='N')){
					i++;
					break;
				}
			}
			continue;
		case 2:
			puts("Inserisci il nome da cercare");
			scanf("%39s",buffer);
			for (j=0;j<L;j++){
				if(strstr((v+j)->nome,buffer)){
					puts("Corrispondenza trovata");
					printf("%s\n %s\n",v[j].nome, v[j].tel);
				}
			}
			continue;
		case 3:
			puts("Inserisci il numero da cercare");
			scanf("%19s",telefono);
			for (j=0;j<L;j++){
				if(strstr((v+j)->tel,telefono)){
					puts("Corrispondenza trovata");
					printf("%s\n %s\n",v[j].nome, v[j].tel);
				}
			}
			continue;
		case 4:
			qsort(v,i,sizeof(r_t),confronta);
			for(j=0;j<i;j++){
				printf("%s %s\n",v[j].nome, v[j].tel);
			}
			continue;
		default:
			puts("Errore di input. Riprova");
			continue;
		}
	}
	return 0;
}
