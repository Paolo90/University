#include<stdio.h>
#include<stdarg.h>
void stampa(int args,...){
	int i;
	va_list ap;
	va_start(ap,args);
	for(i=0;i<args;i++){
		printf("Il nome stampato è %s\n",va_arg(ap,char*));
	}
	va_end(ap);
}
int main(){
	int k=3;
	stampa(k,"Paolo","Luisa","Leda");
	return 0;
}
