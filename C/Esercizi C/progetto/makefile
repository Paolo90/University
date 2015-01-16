massimo.o:massimo.c
	gcc -c -I . massimo.c -o massimo.o
minimo.o:
	gcc -c -I . minimo.c -o minimo.o
media_aritmetica.o:media_aritmetica.c
	gcc -c -I . media_aritmetica.c -o media_aritmetica.o
libarch.a: massimo.o minimo.o media_aritmetica.o
	ar -rcs libarch.a massimo.o minimo.o media_aritmetica.o
finale: principale.c libarch.a
	gcc -I . -L . principale.c -larch -o finale
