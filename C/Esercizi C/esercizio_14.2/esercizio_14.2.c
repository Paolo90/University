#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
int main(int argc, char* argv[]){
	FILE *file_in=fopen(argv[1],"r");
	FILE *file_out=fopen(argv[6],"w");
	int id;
	int azione[5];
	int t=0;
	char ch;
	char *buffer="";
	int mod; /* Argomento opzioni*/
	int num; /* numero identificativo dell'azienda */
	int ris; /* azioni rimaste dopo transazione */
	if((file_in!=NULL)&&(file_out!=NULL)){
		num=atoi(argv[3]);
		while(fscanf(file_in,"%i %i %i %i %i %i",&id,&azione[0],&azione[1],&azione[2],&azione[3],&azione[4])==6){
			/*fprintf(file_out,"%i %i %i %i %i %i\n",id,azione[0],azione[1],azione[2],azione[3],azione[4]);*/
			if (id==atoi(argv[2])){
				while(((ch=getopt(argc,argv,"A:V:G:"))!=EOF)&&(t==0)){
					switch(ch){
					case 'A':
						buffer=optarg;
						mod=atoi(buffer);
						/*printf("valore opzione: %i al passo %i\n",mod,t);*/
						azione[num-1]=azione[num-1]+mod;
						/*if(ris<=0){
							fprintf(stderr,"Errore di input per l'opzione A\n");
							return 1;
						}*/
						fprintf(file_out,"%i %i %i %i %i %i\n",id,azione[0],azione[1],azione[2],azione[3],azione[4]);
						t++;
						break;
					case 'V':
						buffer=optarg;
						mod=atoi(buffer);
						/*printf("valore opzione: %i al passo %i\n",mod,t);*/
						azione[num-1]=azione[num-1]-mod;
						if(ris<=0){
							fprintf(stderr,"Errore di input per l'opzione V\n");
							return 1;
						}
						fprintf(file_out,"%i %i %i %i %i %i\n",id,azione[0],azione[1],azione[2],azione[3],azione[4]);
						t++;
						break;
					case 'G':
						buffer=optarg;
						mod=atoi(buffer);
						/*printf("valore opzione: %i al passo %i\n",mod,t);*/
						azione[num-1]=azione[num-1]+mod;
						/*if(ris<=0){
							fprintf(stderr,"Errore di input per l'opzione A\n");
							return 1;
						}*/
						fprintf(file_out,"%i %i %i %i %i %i\n",id,azione[0],azione[1],azione[2],azione[3],azione[4]);
						t++;
						break;
					default:
						puts("Errore nell'inserimento delle opzioni");
						return 1;
					}
				}
			}
		}
	}else{
		fprintf(stderr,"Errore di apertura dei file\n");
		return 1;
	}
	fclose(file_in);
	fclose(file_out);
	return 0;
}
