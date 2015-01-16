#include<stdio.h>
#include<string.h>
int main(){
	char testo[1000][100];
	int i=0;
	int conta_caratteri=0;
	int parole=1;
	int j;
	do{
		puts("Inserisci una riga di testo");
		fgets(testo[i],sizeof(testo[i]),stdin);
		size_t L=strlen(testo[i]);
		for(j=0;j< L-1;j++){
			if(testo[i][j] != ' '){
				conta_caratteri++;
			}else{
				parole++;
			}
		}
		/*printf("La stringa contiene %i caratteri e %i parole\n",conta_caratteri -4,parole);*/
		/*conta_caratteri=0;*/
		i++;
	}while(strcmp(testo[i-1],"FINE\n")!=0);
	printf("La stringa contiene IN TUTTO %i caratteri e %i parole\n",conta_caratteri -4,parole);
	printf("Sono state inserite %i righe \n",i-1);
	return 0;
}
