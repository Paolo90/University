#!/usr/bin/python

import MySQLdb as mdb

con = mdb.connect('193.205.222.89', 'labo', 'lab0rat0r10','paolo')
cur = con.cursor()
cur.execute("SELECT altezza,latitudine, logitudine FROM dati")
testo = cur.fetchall()
x=input('Inserisci 1 se vuoi leggere tutta la tabella o 0 se vuoi leggere solo una riga  ')
if x==1:
        for i in range(len(testo)):
                print testo[i]

        con.close()
elif x==0:
        y=input('Inserisci il numero della riga che vuoi visualizzare  ')
        print testo[y]
else:
        print 'errore di input'
