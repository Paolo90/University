#include <stdio.h>
#include <string.h>
/*# define NULL 0*/
int main(){
	char s[100];
	puts("Inserisci la frase: ");
	fgets(s,sizeof(s),stdin);
	puts("La frase inserita è:");
	printf("%s\n",s);
	puts("");
	char t[100];
	if(strchr(s,'.')==NULL){
		printf("La nuova frase è uguale alla vecchia:\n %s",s);
	}else{
		int i;
		for(i=0;i<100;i++){
			if(*(s+i)=='.'){
				t[i]='\n';
			}else{
				t[i]=s[i];
			}
		}
		puts("");
		printf("%s\n",t);
	}
	return 0;
}
