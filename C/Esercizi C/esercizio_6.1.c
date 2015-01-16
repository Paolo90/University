#include <stdio.h>
#include <string.h>
int main(){
	char frase[100];
	puts("Inserisci la frase: ");
	fgets(frase,100,stdin);
	int Lun=strlen(frase);
	char stringa[Lun];
	strcpy(stringa,frase);
	int a=0;
	int b=0;
	int c=0;
	int d=0;
	int e=0;
	int f=0;
	int g=0;
	int h=0;
	int i=0;
	int j=0;
	int k=0;
	int l=0;
	int m=0;
	int n=0;
	int o=0;
	int p=0;
	int q=0;
	int r=0;
	int s=0;
	int t=0;
	int u=0;
	int v=0;
	int w=0;
	int x=0;
	int y=0;
	int z=0;
	int ii;
	for(ii=0;ii<Lun;ii++){
		if((*(stringa+ii)=='a')||(*(stringa+ii)=='A')){
			printf("La %i ma lettera è una vocale\n",ii+1);
			a++;
		}else if((*(stringa+ii)=='b')||(*(stringa+ii)=='B')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			b++;
		}else if((*(stringa+ii)=='c')||(*(stringa+ii)=='C')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			c++;
		}else if((*(stringa+ii)=='d')||(*(stringa+ii)=='D')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			d++;
		}else if((*(stringa+ii)=='e')||(*(stringa+ii)=='E')){
			printf("La %i ma lettera è una vocale\n",ii+1);
			e++;
		}else if((*(stringa+ii)=='f')||(*(stringa+ii)=='F')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			f++;
		}else if((*(stringa+ii)=='g')||(*(stringa+ii)=='G')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			g++;
		}else if((*(stringa+ii)=='h')||(*(stringa+ii)=='H')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			h++;
		}else if((*(stringa+ii)=='i')||(*(stringa+ii)=='I')){
			printf("La %i ma lettera è una vocale\n",ii+1);
			i++;
		}else if((*(stringa+ii)=='j')||(*(stringa+ii)=='J')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			j++;
		}else if((*(stringa+ii)=='k')||(*(stringa+ii)=='K')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			k++;
		}else if((*(stringa+ii)=='l')||(*(stringa+ii)=='L')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			l++;
		}else if((*(stringa+ii)=='m')||(*(stringa+ii)=='M')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			m++;
		}else if((*(stringa+ii)=='n')||(*(stringa+ii)=='N')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			n++;
		}else if((*(stringa+ii)=='o')||(*(stringa+ii)=='O')){
			printf("La %i ma lettera è una vocale\n",ii+1);
			o++;
		}else if((*(stringa+ii)=='p')||(*(stringa+ii)=='P')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			p++;
		}else if((*(stringa+ii)=='q')||(*(stringa+ii)=='Q')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			q++;
		}else if((*(stringa+ii)=='r')||(*(stringa+ii)=='R')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			r++;
		}else if((*(stringa+ii)=='s')||(*(stringa+ii)=='S')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			s++;
		}else if((*(stringa+ii)=='t')||(*(stringa+ii)=='T')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			t++;
		}else if((*(stringa+ii)=='u')||(*(stringa+ii)=='U')){
			printf("La %i ma lettera è una vocale\n",ii+1);
			u++;
		}else if((*(stringa+ii)=='v')||(*(stringa+ii)=='V')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			v++;
		}else if((*(stringa+ii)=='w')||(*(stringa+ii)=='W')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			w++;
		}else if((*(stringa+ii)=='x')||(*(stringa+ii)=='X')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			x++;
		}else if((*(stringa+ii)=='y')||(*(stringa+ii)=='Y')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			y++;
		}else if((*(stringa+ii)=='z')||(*(stringa+ii)=='Z')){
			printf("La %i ma lettera è una consonante\n",ii+1);
			z++;
		}else if((*(stringa+ii)==' ')||(*(stringa+ii)==',')||(*(stringa+ii)==';')||(*(stringa+ii)=='?')){
			puts("\n");
		}else{
			;
		}
	}
	printf("a=%i\n",a);
	printf("b=%i\n",b);
	printf("c=%i\n",c);
	printf("d=%i\n",d);
	printf("e=%i\n",e);
	printf("f=%i\n",f);
	printf("g=%i\n",g);
	printf("h=%i\n",h);
	printf("i=%i\n",i);
	printf("j=%i\n",j);
	printf("k=%i\n",k);
	printf("l=%i\n",l);
	printf("m=%i\n",m);
	printf("n=%i\n",n);
	printf("o=%i\n",o);
	printf("p=%i\n",p);
	printf("r=%i\n",q);
	printf("r=%i\n",r);
	printf("s=%i\n",s);
	printf("t=%i\n",t);
	printf("u=%i\n",u);
	printf("v=%i\n",v);
	printf("w=%i\n",w);
	printf("x=%i\n",x);
	printf("y=%i\n",y);
	printf("z=%i\n",z);
	return 0;
}
