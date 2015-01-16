#!/usr/bin/python



import MySQLdb as mdb



con = mdb.connect('193.205.222.89', 'labo', 'lab0rat0r10','paolo')

cur = con.cursor()
z=raw_input("inserisci il nome ")
a=input("inserisci la distanza bidimensionale ")
b=input("inserisci la distanza tridimensionale ")
c=input("inserisci l'errore bidimensionale ")
d=input("inserisci l'errore tridimensionale ")

cur.execute("INSERT INTO distanze_php SET Nome_percorso=%s, Distanza_bidimensionale=%s, Distanza_tridimensionale=%s, Errore_bidimensionale=%s, Errore_tridimensionale=%s",(z,a,b,c,d))
con.commit()

con.close()
