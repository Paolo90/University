#!/usr/bin/python



import MySQLdb as mdb



con = mdb.connect('193.205.222.89', 'labo', 'lab0rat0r10','paolo')

cur = con.cursor()
B=input('Inserisci il numero di righe che vuoi scrivere ')
i=1
while i<=B:
        z=input("inserisci il tempo ")
        a=input("inserisci la latitudine ")
        b=input("inserisci la longitudine ")
        c=input("inserisci l'altezza ")
        d=input("inserisci la velocita' ")
        e=input("inserisci l'errore sulla latitudine ")
        f=input("inserisci l'errore sulla longitudine ")
        g=input("inserisci l'errore sull'altezza ")
        h=input("inserisci l'errore sulla velocita' ")
        cur.execute("INSERT INTO raspy SET Time=%s, Latitude=%s, Longitude=%s, Altitude=%s, Speed=%s, Lat_err=%s, Lon_err=%s, Alt_err=%s, Speed_err=%s ",(z,a,b,c,d,e,f,g,h))
        con.commit()
        i=i+1

con.close()

