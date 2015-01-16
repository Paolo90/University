#include<stdio.h>
#include<stdlib.h>
#include<string.h>
typedef struct{
	char nome[15];
	int id;
}squadre;
int ordina(const void* a, const void* b){
	squadre *sa=(squadre*)a;
	squadre *sb=(squadre*)b;
	return (sa->id - sb->id);
}
int somma(int v[],int k){
	int i;
	int S=0;
	for(i=0;i<k;i++){
		S+=v[i];
	}
	return S;
}
int main(int argc, char* argv[]){
	FILE *in=fopen("squadre.txt","r");
	FILE *argom=fopen(argv[1],"r");
	if((!in)||(!argom)){
		fprintf(stderr,"File non valido\n");
		return 1;
	}
	squadre v[64]; /*struttura con dati squadre partecipanti*/
	int i=0;
	while(fscanf(in,"%i %14s[^\n]",&(v[i].id),(v[i].nome))==2){
		/*printf("nome squadra: %s id: %i\n", v[i].nome, v[i].id);*/
		i++;
	}
	int l;
	squadre w[i];
	for(l=0;l<i;l++){
		strcpy(w[l].nome,v[l].nome);
		w[l].id=v[l].id;
		/*printf("nome squadra: %s id: %i\n", w[l].nome, w[l].id);*/
	}
	qsort(w,i,sizeof(squadre),ordina);
	puts("");
	puts("Elenco ordinato");
	for(l=0;l<i;l++){
		printf("nome squadra: %s id: %i\n", w[l].nome, w[l].id);
	}
	int M[32][4]; /*Matrice del file ris.txt non ordinata: se ho al più 64 squadre allora ho al più 32 match*/
	int R[32][3]; /*Risulati (vittoria/pareggio/sconfitta) ordinati per numero di squadra */
	int j=0;
	for(j=0;j<32;j++){
		R[j][0]=0;
		R[j][1]=0;
		R[j][2]=0;
	}
	j=0;
	while(fscanf(argom,"%i %i %i %i",&(M[j][0]),&(M[j][1]),&(M[j][2]),&(M[j][3]))==4){
		printf("%i %i %i %i\n",M[j][0],M[j][1],M[j][2],M[j][3]);
		if(M[j][2] > M[j][3]){
			R[(M[j][0])-1][0]++;
			R[(M[j][1])-1][2]++;
		}else if(M[j][2] < M[j][3]){
			R[(M[j][1])-1][0]++;
			R[(M[j][0])-1][2]++;
		}else{
			R[(M[j][0])-1][1]++;
			R[(M[j][1])-1][1]++;
		}
		j++;
	}
	int k;
	int partite_giocate[j];
	puts("------------------------------------");
	for(k=0;k<i;k++){
		partite_giocate[k]=somma(R[k],3);
		printf("La squadra %s ha giocato %i partite e ha totalizzato %i punti con %i vittorie, %i pareggi e %i sconfitte\n",w[k].nome,partite_giocate[k],(R[k][0]) *3 + R[k][1], R[k][0],R[k][1],R[k][2]);
	}
	return 0;
}
