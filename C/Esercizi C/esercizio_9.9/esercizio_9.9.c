#include <stdio.h>
#include <string.h>
#include <math.h>
#include <unistd.h>
float media=0;
float average(int vett[]){
	int cond=1;
	int i=0;
	while(cond){
		if(vett[i]>=18){
			media+=vett[i];
			i++;
			/* printf("%f\n",media); */
		}else if((vett[i]>=0)&&(vett[i]<18)){
			i++;
		}else{
			cond=0;
		}
	}
	media=(media/i); 
	return media;
}
int main(int argc, char *argv[]){
	int matricola;
	int codice;
	int data;
	int voto;
	int conta=0;
	FILE *file_in=fopen(argv[1],"r");
	while(fscanf(file_in,"%i %i %i %i",&matricola, &codice, &data, &voto)==4){
		if(voto>=18){
			conta++;
		}else if(voto>30){
			fprintf(stderr,"Errore di input: controllare i voti\n");
			return 2;
		}
	}
	printf("conta=%i\n",conta);
	int v[conta];
	int t=0;
	fclose(file_in);
	FILE *file_inpu=fopen(argv[1],"r");
	while(fscanf(file_inpu,"%i %i %i %i",&matricola, &codice, &data, &voto)==4){
		if(voto>=18){
			v[t]=voto;
			printf("%i\n",v[t]);
			t++;
		}
	}
	fclose(file_inpu);
	FILE *file_inp=fopen(argv[1],"r");
	char ch;
	char *ops="";
	char *opa="";
	char *ope="";
	while((ch=getopt(argc,argv,"s:a:e:"))!=EOF){
		switch(ch){
		case 's':
			ops=optarg;
			break;
		case 'a':
			opa=optarg;
			break;
		case 'e':
			ope=optarg;
			break;
		default:
			fprintf(stderr,"Unknown option: '%s'\n", optarg);
			return 1;
		}
	}
	char Matricola[6];
	char Codice[4];
	char Data[8];
	char Voto[2];
	int k=0;
	printf("%f\n",average(v));
	int w[conta];
	media=0;
	while(fscanf(file_inp,"%s %s %s %s",Matricola, Codice, Data, Voto)==4){
		if(strstr(Matricola,ops)){
			printf("matricola: %s\n",ops);
			w[k]=v[k];
			printf("%i\n",w[k]);
			k++;
		}else{
			w[k]=0;
			printf("%i\n",w[k]);
			k++;
		}
	} 
	printf("%f\n",average(w));
	fclose(file_in);
	return 0;
}
