#!/usr/bin/python
import sys
import MySQLdb as mdb
import math
con=mdb.connect('193.205.222.89','labo','lab0rat0r10','paolo')
cur=con.cursor()
cur.execute("SELECT * FROM raspy")
matrice=cur.fetchall()
len(matrice)
#definsico le variabili inizio e fine
inizio=sys.argv[1]
fine=sys.argv[2]
#SELECT * FROM TuaTabella WHERE TuoCampoData BETWEEN(minore o uguale) DataInizio AND DataFine (minore uguale)
cur=con.cursor()
cur.execute("SELECT * FROM raspy WHERE Time BETWEEN %s AND %s",(inizio, fine))
percorso=cur.fetchall()
#con.commit()

L=len(percorso)
print "La matrice percorso ha", L, "righe"
lat=[0]*L
lon=[0]*L
alt=[0]*L
vel=[0]*L
dlat=[0]*L
dlon=[0]*L
dalt=[0]*L
dvel=[0]*L
i=0
for riga in percorso:
        lat[i]=riga[2]
        lon[i]=riga[3]
        alt[i]=riga[4]
        vel[i]=riga[5]
        dlat[i]=riga[6]
        dlon[i]=riga[7]
        dalt[i]=riga[8]
        dvel[i]=riga[9]
        i=i+1
matrice=[lat,lon,alt,vel,dlat,dlon,dalt,dvel]
print matrice
import math
def distanza(A,B):
 R=6372795.477598
 dis=R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))
 return dis

gran=[1,3,5]
DISTANZA2D=[0]*len(gran)


dist_2dim=0
n=0
for q in gran:
	t=0
	while t<(len(lat)-1) and t+q<(len(lat)-1):
   		dist_2dim=dist_2dim + (distanza(t,t+q))
   		t=t+q
	if t!=0:
		dist_2dim=dist_2dim+distanza(t-q,len(lat)-1)
	elif t==0:
		dist_2dim=dist_2dim+distanza(t,len(lat)-1)
		
	DISTANZA2D[n]=dist_2dim
        n=n+1

print "la distanza del percorso bidimensionale e", dist_2dim, "metri"

DISTANZA3D=[0]*len(gran)

dist_3dim=0
n=0
for q in gran:
	k=0
	while k<(len(alt)-1) and k+q<(len(lat)-1):
  		dist_3dim=dist_3dim+math.sqrt((distanza(k,k+q))**2+(alt[k]-alt[k+q])**2)
		k=k+q
	if k!=0:
		dist_3dim=dist_3dim+math.sqrt((distanza(k-q,len(lat)-1))**2+(alt[k-q]-alt[len(lat)-1])**2)
	elif k==0:
		dist_3dim=dist_3dim+math.sqrt((distanza(k,len(lat)-1))**2+(alt[k]-alt[len(lat)-1])**2)
	DISTANZA3D[n]=dist_3dim
	n=n+1

print "la distanza del percorso tridimensonale senza considerare l'errore e ", dist_3dim, "metri"

differenza=dist_3dim-dist_2dim
print "la differenza tra i due percorsi risulta essere", differenza, "metri"

def Ddist_su_Dlat1(A,B):
   R=6372795.477598
   der_lat_1=abs((1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))*((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*((math.sin(lat[B]*(3.14/180)))*(math.cos(lat[A]*(3.14/180)))-(math.cos(lat[B]*(3.14/180)))*(math.sin(lat[A]*(3.14/180)))*(math.cos((lon[A]-lon[B])*(3.14/180)))))
   return der_lat_1

def Ddist_su_Dlat2(A,B):
   R=6372795.477598
   der_lat_2=abs((1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))*((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*((math.sin(lat[A]*(3.14/180)))*(math.cos(lat[B]*(3.14/180)))-(math.cos(lat[A]*(3.14/180)))*(math.sin(lat[B]*(3.14/180)))*(math.cos((lon[A]-lon[B])*(3.14/180)))))
   return der_lat_2

def Ddist_su_Dlon1(A,B):
   R=6372795.477598
   der_lon_1=abs((1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))*((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*((math.cos(lat[A]*(3.14/180)))*(math.cos(lat[B]*(3.14/180)))*(-math.sin((lon[A]-lon[B])*(3.14/180)))))
   return der_lon_1

def Ddist_su_Dlon2(A,B):
   R=6372795.477598
   der_lon_2=abs((1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))*((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*((math.cos(lat[A]*(3.14/180)))*(math.cos(lat[B]*(3.14/180)))*(math.sin((lon[A]-lon[B])*(3.14/180)))))
   return der_lon_2

def Ddist_su_Dalt1(A,B):
   R=6372795.477598
   der_alt_1=abs((1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(alt[A]-alt[B]))
   return der_alt_1

def Ddist_su_Dalt2(A,B):
   R=6372795.477598
   der_alt_2=abs((-1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(alt[A]-alt[B]))
   return der_alt_2
def errore (A,B):
   R=6372795.477598
   err= math.sqrt((Ddist_su_Dlat1(A,B)*(dlat[A]*3.14/180))**2+(Ddist_su_Dlon1(A,B)*(dlon[A]*3.14/180))**2+(Ddist_su_Dlat2(A,B)*(dlat[B]*3.14/180))**2+(Ddist_su_Dlon2(A,B)*(dlon[B]*3.14/180))**2)
   return err

ERRORE3D=[0]*len(gran)

errore_3dim=0
n=0
for q in gran:
	j=0
	while j<len(lat)-1 and j+q<len(lat)-1:
  		errore_3dim=errore_3dim + (errore(j,j+q))*(errore(j,j+q))
  		j=j+q
	if j!=0:
		errore_3dim=errore_3dim + (errore(j-q,len(lat)-1))*(errore(j-q,len(lat)-1))
	elif j==0:
		errore_3dim=errore_3dim + (errore(j,len(lat)-1))*(errore(j,len(lat)-1))
	ERRORE3D[n]=math.sqrt(errore_3dim)
	n=n+1

print "la distanza del percorso tridimensionale e ", dist_3dim, "metri, con un errore di", errore_3dim, "metri"

def Ddist_su_Dlat1_2dim(A,B):
   R=6372795.477598
   der_lat_1_2dim=(-R)*(math.sin(lat[B]*(3.14/180))*math.cos(lat[A]*(3.14/180))-math.sin(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))/(math.sqrt((1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))
   return der_lat_1_2dim

def Ddist_su_Dlat2_2dim(A,B):
   R=6372795.477598
   der_lat_2_2dim=((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))* math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*(math.sin(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))-math.cos(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))
   return der_lat_2_2dim

def Ddist_su_Dlon1_2dim(A,B):
   R=6372795.477598
   der_lon_1_2dim=((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*  math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*(-math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.sin((lon[A]-lon[B])*(3.14/180)))
   return der_lon_1_2dim

def Ddist_su_Dlon2_2dim(A,B):
   R=6372795.477598
   der_lon_2_2dim=((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*
   math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*(math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.sin((lon[A]-lon[B])*(3.14/180)))
   return der_lon_2_2dim

def errore2dim (A,B):
   R=6372795.477598
   err2dim=math.sqrt((Ddist_su_Dlat1_2dim(A,B)*(dlat[A]*3.14/180))**2+(Ddist_su_Dlon1_2dim(A,B)*(dlon[A]*3.14/180))**2+ (Ddist_su_Dlat2_2dim(A,B)*(dlat[B]*3.14/180))**2+(Ddist_su_Dlon2_2dim(A,B)*(dlon[B]*3.14/180))**2)
   return err2dim

print "la distanza del percorso tridimensionale e ", dist_3dim, "metri, con un errore di", errore_3dim, "metri"

def Ddist_su_Dlat1_2dim(A,B):
   R=6372795.477598
   der_lat_1_2dim=(-R)*(math.sin(lat[B]*(3.14/180))*math.cos(lat[A]*(3.14/180))-math.sin(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))/(math.sqrt((1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))
   return der_lat_1_2dim

def Ddist_su_Dlat2_2dim(A,B):
   R=6372795.477598
   der_lat_2_2dim=((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*(math.sin(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))-math.cos(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))
   return der_lat_2_2dim

def Ddist_su_Dlon1_2dim(A,B):
   R=6372795.477598
   der_lon_1_2dim=((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*(-math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.sin((lon[A]-lon[B])*(3.14/180)))
   return der_lon_1_2dim

def Ddist_su_Dlon2_2dim(A,B):
   R=6372795.477598
   der_lon_2_2dim=((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*(math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.sin((lon[A]-lon[B])*(3.14/180)))
   return der_lon_2_2dim

def errore2dim (A,B):
   R=6372795.477598
   err2dim=math.sqrt((Ddist_su_Dlat1_2dim(A,B)*(dlat[A]*3.14/180))**2+(Ddist_su_Dlon1_2dim(A,B)*(dlon[A]*3.14/180))**2+(Ddist_su_Dlat2_2dim(A,B)*(dlat[B]*3.14/180))**2+(Ddist_su_Dlon2_2dim(A,B)*(dlon[B]*3.14/180))**2)
   return err2dim

errore_2dim=0

ERRORE2D=[0]*len(gran)
n=0
for q in gran:
	h=0
	while h<len(alt)-1 and h+q<len(lat)-1:
  		errore_2dim=errore_2dim + (errore2dim(h,h+q))*(errore2dim(h,h+q))
  		h=h+q
	if h!=0:
		errore_2dim=errore_2dim + (errore2dim(h-q,len(lat)-1))*(errore2dim(h-q,len(lat)-1))
	elif h==0:
		errore_2dim=errore_2dim + (errore2dim(h,len(lat)-1))*(errore2dim(h,len(lat)-1))
	ERRORE2D[n]=math.sqrt(errore_2dim)
	n=n+1

n=0
punti=[0]*len(gran)
for q in gran:
	conta=1
	P=0
	while P<len(lat)-1:
		conta=conta+1
		P=P+q
	punti[n]=conta
	n=n+1

print "la distanza del percorso bidimensionale e ", dist_2dim, "metri, con un errore di", errore_2dim, "metri"

print DISTANZA2D
print ERRORE2D
print DISTANZA3D
print ERRORE3D
print punti
