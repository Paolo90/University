#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main(int argc, char *argv[]){
	int max_data=366;
	int min_data=1;

	float entrata;
	float uscita;
	int data;
	char motivazione_e[50];
	char motivazione_u[50];
	char l_1[1]; /*E*/
	char l_2[1]; /*U*/
	FILE *in=fopen(argv[1],"r");
	FILE *w1=fopen("entrate.dat","a");
	FILE *w2=fopen("uscite.dat","a");
	if(!in){
		puts("File non valido. Uscita dal programma");
		return 1;
	}
	while(fscanf(in,"%i %s %f %s %s %f %s",&data,l_1,&entrata,motivazione_e,l_2,&uscita,motivazione_u)==7){
		if((data<=366)&&(data>=1)){
			fprintf(w1,"%i %.2f %s\n",data,entrata,motivazione_e);
			fprintf(w2,"%i %.2f %s\n",data,uscita,motivazione_u);
		}
	}
	fclose(in);
	fclose(w1);
	fclose(w2);
	float t_e=0;
	float t_u=0;
	w1=fopen("entrate.dat","r");
	w2=fopen("uscite.dat","r");
	while(fscanf(w1,"%i %f %s",&data,&entrata,motivazione_e)==3){
		t_e+=entrata;
	}
	while(fscanf(w2,"%i %f %s",&data,&uscita,motivazione_u)==3){
		t_u+=uscita;
	}
	printf("il saldo totale è %.2f\n",t_e - t_u);
	return 0;	
}
