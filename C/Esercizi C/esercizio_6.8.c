#include<stdio.h>
#include<string.h>
#include<stdio_ext.h>
int main(){
	puts("Inserisci una stringa di al più 30 caratteri");
	char str_1[30];
/*	scanf("%29s",str_1);*/
	fgets(str_1,sizeof(str_1),stdin);
	puts("Inserisci una stringa di al più 30 caratteri");
	char str_2[30];
	__fpurge(stdin);
	fgets(str_2,sizeof(str_2),stdin);
	size_t L_1=strlen(str_1);
	size_t L_2=strlen(str_2);
	printf("La prima stringa è lunga %i e la seconda %i\n",L_1 -1,L_2 -1);
	int i; /*L_2*/
	int j; /*L_1*/
	if(L_1 <= L_2){
		for(i=0;i < L_2;i++){
			for(j=0;j < L_1;j++){
				if(str_1[j]==str_2[i]){
					str_2[i]='*';
					/*str_1[j]='*';*/
				}
			}
		}
	}else{
		for(j=0;j < L_1;j++){
			for(i=0;i < L_2;i++){
				if(str_1[j]==str_2[i]){
					str_1[j]='*';
					/*str_2[i]='*';*/
				}
			}
		}
	}
	printf("%s %s\n",str_1,str_2);
	return 0;
}
