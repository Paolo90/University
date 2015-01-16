#!/usr/bin/python



import MySQLdb as pippo



con = pippo.connect('193.205.222.89', 'labo', 'lab0rat0r10','paolo')

cur = con.cursor()

c=input('Inserisci id riga da eliminare  ')

cur.execute("DELETE FROM dati WHERE id_campionamento=%s",(c))
con.commit()
testo = cur.fetchall()

for i in range(len(testo)):
        print testo[i]

con.close()
