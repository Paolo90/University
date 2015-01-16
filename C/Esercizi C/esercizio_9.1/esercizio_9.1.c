#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main(int argc, char *argv[]){
	FILE *file_in=fopen(argv[1],"r"); /* Se si vuole passare qualcosa come argomento bisogna fare un nuovo stream dati */
	char code[6]; /* abc123 */
	int hrs;
	int min;
	int cond=0;
	int hrs_pre;
	int min_pre;
	int min_w=0;
	if(!(file_in)){
		fprintf(stderr,"Impossible opening the file");
		return 2;
	}
	if(argv[2]){
		while(fscanf(file_in,"%i %i %s[^\n]",&hrs,&min,code)==3){
			if((strstr(code,argv[2]))&&(cond==1)){
				if(hrs>hrs_pre){
					min_w += 60 - min_pre + (hrs - hrs_pre - 1)*60 +min;
				}else if(hrs_pre==hrs){
					min_w += min - min_pre;
				}
				hrs_pre=hrs;
				min_pre=min;
			}else if((strstr(code,argv[2]))&&(cond==0)){
				cond=1;
				hrs_pre=hrs;
				min_pre=min;
			}
		}
		if(min_w==0){
			printf("The worker %s has worked all the day\n",argv[2]);
		}else{
			printf("The worker %s has worked %i minutes today\n",argv[2],min_w);
		}
	}else{
		char t[1000][6];
		int workers=0;
		int condd;
		int i=0;
		int j;
		int k;
		while(fscanf(file_in,"%i %i %s[^\n]",&hrs, &min,code)==3){
			/* printf("%s\n",code); */
			if(cond==1){
				for(j=0;j<i;j++){
					if(strstr(t[j],code)){ /* chiedere perché strcmp non funziona */
						condd=0;
						break;
						printf("ciclo");
					}else if(strcmp(t[j],code)!=0){
						condd=1;
					}
				}
				if(condd){
					/* printf("%i\n",i); */
					workers++;
				}
				for(k=0;k<6;k++){
					/* printf("%c",code[k]); */
					t[i][k]=code[k];
				}
				/* printf("t[%i]=%s\n",i,t[i]); */
			}else{
				workers++;
				cond=1;
				for(j=0;j<6;j++){
					t[i][j]=code[j];
				}
			}
			i++;
		}
		printf("There are %i workers\n",workers);
	}
	fclose(file_in);
	return 0;
}
