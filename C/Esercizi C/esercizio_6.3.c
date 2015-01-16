#include <stdio.h>
int main(){
	char s[100];
	puts("Inserisci una frase:");
	fgets(s,sizeof(s),stdin);
	char t[199];
	int i;
	int j=0;
	for(i=0;i<100;i++){
		if((s[i]=='a')||(*(s+i)=='e')||(*(s+i)=='i')||(s[i]=='o')||(s[i]=='u')){
			t[j]=s[i];
			t[j+1]='f';
			j+=2;
		}else if((s[i]=='A')||(*(s+i)=='E')||(*(s+i)=='I')||(s[i]=='O')||(s[i]=='U')){
			t[j]=s[i];
			t[j+1]='F';
			j+=2;
		}else{
			t[j]=s[i];
			j++;
		}
	}
	printf("La frase in codice è:\n %s\n",t);
	return 0;
}
