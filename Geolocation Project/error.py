#!/usr/bin/python
import sys
import MySQLdb as mdb
i=0
lat=[0]*22
lon=[0]*22
alt=[0]*22
dlat=[0]*22
dlon=[0]*22
dalt=[0]*22
con=mdb.connect('193.205.222.89','labo','lab0rat0r10','alice')
cur=con.cursor()
cur.execute("SELECT * FROM parpercorso")
righe=cur.fetchall()

for riga in righe:
 lat[i]=riga[4]
 lon[i]=riga[2]
 alt[i]=riga[0]
 dlat[i]=riga[5]
 dlon[i]=riga[3]
 dalt[i]=riga[1]
 i= i+1

import math

def distanza(A,B):
 R=6372795.477598
 dis=R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))
 *math.cos((lon[A]-lon[B])*(3.14/180)))
 return dis


dist_2dim=0
t=0
while t<(len(lat)-1):
   dist_2dim=dist_2dim + (distanza(t,t+1))
   t=t+1

print "la distanza del percorso bidimensionale e", dist_2dim, "metri"

dist_3dim=0
k=0
while k<(len(alt)-1):
  dist_3dim=dist_3dim+math.sqrt((distanza(k,k+1))**2+(alt[k]-alt[k+1])**2)
  k=k+1

print "la distanza del percorso tridimensonale senza considerare l'errore e ", dist_3dim, "metri"

differenza=dist_3dim-dist_2dim
print "la differenza tra i due percorsi risulta essere", differenza, "metri"


def Ddist_su_Dlat1(A,B):
   R=6372795.477598
   der_lat_1=abs((1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*
   math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(R*math.acos(math.sin(lat[A]*(3.14/180))*
   math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))*
   ((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*
   math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*((math.sin(lat[B]*(3.14/180)))*(math.cos(lat[A]*(3.14/180)))-(math.cos(lat[B]*(3.14/180)))*
   (math.sin(lat[A]*(3.14/180)))*(math.cos((lon[A]-lon[B])*(3.14/180)))))
   return der_lat_1

def Ddist_su_Dlat2(A,B):
   R=6372795.477598
   der_lat_2=abs((1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*
   math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(R*math.acos(math.sin(lat[A]*(3.14/180))*
   math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))*
   ((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*
   math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*((math.sin(lat[A]*(3.14/180)))*(math.cos(lat[B]*(3.14/180)))-(math.cos(lat[A]*(3.14/180)))*
   (math.sin(lat[B]*(3.14/180)))*(math.cos((lon[A]-lon[B])*(3.14/180)))))
   return der_lat_2

def Ddist_su_Dlon1(A,B):
   R=6372795.477598
   der_lon_1=abs((1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*
   math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(R*math.acos(math.sin(lat[A]*(3.14/180))*
   math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))*
   ((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*
   math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*((math.cos(lat[A]*(3.14/180)))*(math.cos(lat[B]*(3.14/180)))*(-math.sin((lon[A]-lon[B])*
   (3.14/180)))))
   return der_lon_1

def Ddist_su_Dlon2(A,B):
   R=6372795.477598
   der_lon_2=abs((1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*
   math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(R*math.acos(math.sin(lat[A]*(3.14/180))*
   math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))*
   ((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*
   math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*((math.cos(lat[A]*(3.14/180)))*(math.cos(lat[B]*(3.14/180)))*(math.sin((lon[A]-lon[B])*
   (3.14/180)))))
   return der_lon_2

def Ddist_su_Dalt1(A,B):
   R=6372795.477598
   der_alt_1=abs((1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*
   math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(alt[A]-alt[B]))
   return der_alt_1

def Ddist_su_Dalt2(A,B):
   R=6372795.477598
   der_alt_2=abs((-1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*
   math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(alt[A]-alt[B]))
   return der_alt_2
def errore (A,B):
   R=6372795.477598
   err= math.sqrt((Ddist_su_Dlat1(A,B)*(dlat[A]*3.14/180))**2+(Ddist_su_Dlon1(A,B)*(dlon[A]*3.14/180))**2+
   (Ddist_su_Dlat2(A,B)*(dlat[B]*3.14/180))**2+(Ddist_su_Dlon2(A,B)*(dlon[B]*3.14/180))**2)
   return err

errore_3dim=0
j=0
while j<len(alt)-1:
  errore_3dim=errore_3dim + (errore(j,j+1))*(errore(j,j+1))
  j=j+1

errore_3dim=math.sqrt(errore_3dim)

print "la distanza del percorso tridimensionale e ", dist_3dim, "metri, con un errore di", errore_3dim, "metri"

def Ddist_su_Dlat1_2dim(A,B):
   R=6372795.477598
   der_lat_1_2dim=(-R)*(math.sin(lat[B]*(3.14/180))*math.cos(lat[A]*(3.14/180))-math.sin(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*
   math.cos((lon[A]-lon[B])*(3.14/180)))/(math.sqrt((1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*
   (3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))
   return der_lat_1_2dim

def Ddist_su_Dlat2_2dim(A,B):
   R=6372795.477598
   der_lat_2_2dim=((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*
   math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*(math.sin(lat[A]*(3.14/180))*
   math.cos(lat[B]*(3.14/180))-math.cos(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))
   return der_lat_2_2dim

def Ddist_su_Dlon1_2dim(A,B):
   R=6372795.477598
   der_lon_1_2dim=((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*
   math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*(-math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*
   math.sin((lon[A]-lon[B])*(3.14/180)))
   return der_lon_1_2dim

def Ddist_su_Dlon2_2dim(A,B):
   R=6372795.477598
   der_lon_2_2dim=((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*
   math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*(math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*
   math.sin((lon[A]-lon[B])*(3.14/180)))
   return der_lon_2_2dim

def errore2dim (A,B):
   R=6372795.477598
   err2dim=math.sqrt((Ddist_su_Dlat1_2dim(A,B)*(dlat[A]*3.14/180))**2+(Ddist_su_Dlon1_2dim(A,B)*(dlon[A]*3.14/180))**2+
   (Ddist_su_Dlat2_2dim(A,B)*(dlat[B]*3.14/180))**2+(Ddist_su_Dlon2_2dim(A,B)*(dlon[B]*3.14/180))**2)
   return err2dim

errore_2dim=0
h=0

while h<len(alt)-1:
  errore_2dim=errore_2dim + (errore2dim(h,h+1))*(errore2dim(h,h+1))
  h=h+1

errore_2dim=math.sqrt(errore_2dim)

print "la distanza del percorso bidimensionale e ", dist_2dim, "metri, con un errore di", errore_2dim, "metri"


