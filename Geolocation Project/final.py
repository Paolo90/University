#!/usr/bin/python
import sys
import MySQLdb as mdb
import math
from pychart import *
con=mdb.connect('193.205.222.89','labo','lab0rat0r10','paolo')
cur=con.cursor()
cur.execute("SELECT * FROM raspy")
matrice=cur.fetchall()
#definsico le variabili inizio e fine
inizio=sys.argv[1]
fine=sys.argv[2]
#SELECT * FROM TuaTabella WHERE TuoCampoData BETWEEN(minore o uguale) DataInizio AND DataFine (minore uguale)
cur=con.cursor()
cur.execute("SELECT * FROM raspy WHERE Time BETWEEN %s AND %s",(inizio, fine))
percorso=cur.fetchall()
#con.commit()
percorso2=[]
for riga in percorso:
        if (riga[2]!=None and riga[3]!=None and  riga[4]!=None and  riga[5]!=None and  riga[6]!=None and riga[7]!=None and riga[8]!=None and riga[9]!=None):
                percorso2.append(riga)
L=len(percorso2)
lat=[0]*L
lon=[0]*L
alt=[0]*L
vel=[0]*L
dlat=[0]*L
dlon=[0]*L
dalt=[0]*L
dvel=[0]*L
R=6372795.477598
i=0
for riga in percorso2:
        lat[i]=riga[2]
        lon[i]=riga[3]
        alt[i]=riga[4]
        vel[i]=riga[5]
        dlat[i]=riga[6]*180/(R*3.14)
        dlon[i]=riga[7]*180/(R*3.14)
        dalt[i]=riga[8]
        dvel[i]=riga[9]
        i=i+1
matrice=[lat,lon,alt,vel,dlat,dlon,dalt,dvel]
import math
def distanza(A,B):
	pig=math.pi/180
	if A!=B:
		dis= R*math.acos(math.sin(lat[A]*pig)*math.sin(lat[B]*pig)+math.cos(lat[A]*pig)*math.cos(lat[B]pig)*math.cos((lon[A]-lon[B])*pig))
	else:
		dis=0
	return dis

gran=[1,3,5]
DISTANZA2D=[0]*len(gran)

n=0
for q in gran:
        dist_2dim=0
        t=0
        while t<(len(lat)-1) and t+q<(len(lat)-1):

                if percorso2[t][2:4]==percorso2[t+q][2:4]:
                        dist_2dim=dist_2dim
                else:
                        dist_2dim=dist_2dim + (distanza(t,t+q))
                t=t+q
        if t!=0:
                dist_2dim=dist_2dim+distanza(t,len(lat)-1)
        elif t==0:
                dist_2dim=dist_2dim+distanza(t,len(lat)-1)

        DISTANZA2D[n]=dist_2dim
        n=n+1

DISTANZA3D=[0]*len(gran)

n=0
for q in gran:
        dist_3dim=0
        k=0
        while k<(len(lat)-1) and k+q<(len(lat)-1):
                if percorso2[k][2:4]==percorso2[k+q][2:4]:
                        dist_3dim=dist_3dim
                else:
                        dist_3dim=dist_3dim+math.sqrt((distanza(k,k+q))**2+(alt[k]-alt[k+q])**2)
                k=k+q
        if t!=0:
                dist_3dim=dist_3dim+math.sqrt((distanza(k-q,len(lat)-1))**2+(alt[k-q]-alt[len(lat)-1])**2)
        elif t==0:
                dist_3dim=dist_3dim+math.sqrt((distanza(k,len(lat)-1))**2+(alt[k]-alt[len(lat)-1])**2)

        DISTANZA3D[n]=dist_3dim
        n=n+1

differenza=dist_3dim-dist_2dim
print "La differenza tra il percorso in 3d e quello in 2d e'",differenza,"metri"
def Ddist_su_Dlat1(A,B):
	if lat[A]!=lat[B] and lon[A]!=lon[B]:
		der_lat_1=abs((1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))*((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*((math.sin(lat[B]*(3.14/180)))*(math.cos(lat[A]*(3.14/180)))-(math.cos(lat[B]*(3.14/180)))*(math.sin(lat[A]*(3.14/180)))*(math.cos((lon[A]-lon[B])*(3.14/180)))))
	else:
		der_lat_1=0
	return der_lat_1

def Ddist_su_Dlat2(A,B):
	if lat[A]!=lat[B] and lon[A]!=lon[B]:
		der_lat_2=abs((1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))*((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*((math.sin(lat[A]*(3.14/180)))*(math.cos(lat[B]*(3.14/180)))-(math.cos(lat[A]*(3.14/180)))*(math.sin(lat[B]*(3.14/180)))*(math.cos((lon[A]-lon[B])*(3.14/180)))))
	else:
		der_lat_2=0
	return der_lat_2

def Ddist_su_Dlon1(A,B):
	if lat[A]!=lat[B] and lon[A]!=lon[B]:
		der_lon_1=abs((1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))*((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*((math.cos(lat[A]*(3.14/180)))*(math.cos(lat[B]*(3.14/180)))*(-math.sin((lon[A]-lon[B])*(3.14/180)))))
	else:
		der_lon_1=0
	return der_lon_1

def Ddist_su_Dlon2(A,B):
	if lat[A]!=lat[B] and lon[A]!=lon[B]:
		der_lon_2=abs((1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))*((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*((math.cos(lat[A]*(3.14/180)))*(math.cos(lat[B]*(3.14/180)))*(math.sin((lon[A]-lon[B])*(3.14/180)))))
	else:
		der_lon_2=0
	return der_lon_2

def Ddist_su_Dalt1(A,B):
	if lat[A]!=lat[B] and lon[A]!=lon[B]:
		der_alt_1=abs((1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(alt[A]-alt[B]))
	else:
		der_alt_1=0
	return der_alt_1

def Ddist_su_Dalt2(A,B):
	if lat[A]!=lat[B] and lon[A]!=lon[B]:
		der_alt_2=abs((-1/(math.sqrt((R*math.acos(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180))))**2+(alt[A]-alt[B])**2)))*(alt[A]-alt[B]))
	else:
		der_alt_2=0
	return der_alt_2

def errore (A,B):
   err= math.sqrt((Ddist_su_Dlat1(A,B)*(dlat[A]*3.14/180))**2+(Ddist_su_Dlon1(A,B)*(dlon[A]*3.14/180))**2+(Ddist_su_Dlat2(A,B)*(dlat[B]*3.14/180))**2+(Ddist_su_Dlon2(A,B)*(dlon[B]*3.14/180))**2)
   return err

ERRORE3D=[0]*len(gran)

n=0
for q in gran:
        errore_3dim=0
        j=0
        while j<(len(lat)-1) and j+q<(len(lat)-1):
                if percorso2[j][2:4]==percorso2[j+q][2:4]:
                        errore_3dim=errore_3dim
                else:
                        errore_3dim=errore_3dim + (errore(j,j+q))*(errore(j,j+q))
                j=j+q
        if j!=0:
                errore_3dim=errore_3dim + (errore(j-q,len(lat)-1))*(errore(j-q,len(lat)-1))
        elif j==0:
                errore_3dim=errore_3dim + (errore(j,len(lat)-1))*(errore(j,len(lat)-1))

        ERRORE3D[n]=math.sqrt(errore_3dim)
        n=n+1


def Ddist_su_Dlat1_2dim(A,B):
	if lat[A]!=lat[B] and lon[A]!=lon[B]:	
		der_lat_1_2dim=(-R)*(math.sin(lat[B]*(3.14/180))*math.cos(lat[A]*(3.14/180))-math.sin(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))/(math.sqrt((1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))
	else:
		der_lat_1_2dim=0
	return der_lat_1_2dim

def Ddist_su_Dlat2_2dim(A,B):
	if lat[A]!=lat[B] and lon[A]!=lon[B]:
		der_lat_2_2dim=((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))* math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*(math.sin(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))-math.cos(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))
	else:
		der_lat_2_2dim=0
	return der_lat_2_2dim

def Ddist_su_Dlon1_2dim(A,B):
	if lat[A]!=lat[B] and lon[A]!=lon[B]:
		der_lon_1_2dim=((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*  math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*(-math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.sin((lon[A]-lon[B])*(3.14/180)))
	else:
		der_lon_1_2dim=0
	return der_lon_1_2dim

def Ddist_su_Dlon2_2dim(A,B):
	if lat[A]!=lat[B] and lon[A]!=lon[B]:
		der_lon_2_2dim=((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*(math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.sin((lon[A]-lon[B])*(3.14/180)))
	else:
		der_lon_2_2dim=0
	return der_lon_2_2dim

def errore2dim (A,B):
	if lat[A]!=lat[B] and lon[A]!=lon[B]:
		err2dim=math.sqrt((Ddist_su_Dlat1_2dim(A,B)*(dlat[A]*3.14/180))**2+(Ddist_su_Dlon1_2dim(A,B)*(dlon[A]*3.14/180))**2+ (Ddist_su_Dlat2_2dim(A,B)*(dlat[B]*3.14/180))**2+(Ddist_su_Dlon2_2dim(A,B)*(dlon[B]*3.14/180))**2)
	else:
		err2dim=0
	return err2dim

def Ddist_su_Dlat1_2dim(A,B):
	if lat[A]!=lat[B] and lon[A]!=lon[B]:
		der_lat_1_2dim=(-R)*(math.sin(lat[B]*(3.14/180))*math.cos(lat[A]*(3.14/180))-math.sin(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))/(math.sqrt((1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))
	else:
		der_lat_1_2dim=0
	return der_lat_1_2dim

def Ddist_su_Dlat2_2dim(A,B):
	if lat[A]!=lat[B] and lon[A]!=lon[B]:
		der_lat_2_2dim=((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*(math.sin(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))-math.cos(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))
	else:
		der_lat_2_2dim=0
	return der_lat_2_2dim

def Ddist_su_Dlon1_2dim(A,B):
	if lat[A]!=lat[B] and lon[A]!=lon[B]:
		der_lon_1_2dim=((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*(-math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.sin((lon[A]-lon[B])*(3.14/180)))
	else:
		der_lon_1_2dim=0
	return der_lon_1_2dim

def Ddist_su_Dlon2_2dim(A,B):
	if lat[A]!=lat[B] and lon[A]!=lon[B]:
		der_lon_2_2dim=((-R)/(math.sqrt(1-(math.sin(lat[A]*(3.14/180))*math.sin(lat[B]*(3.14/180))+math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.cos((lon[A]-lon[B])*(3.14/180)))**2)))*(math.cos(lat[A]*(3.14/180))*math.cos(lat[B]*(3.14/180))*math.sin((lon[A]-lon[B])*(3.14/180)))
	else:
		der_lon_2_2dim=0
	return der_lon_2_2dim

def velocitamedia(vett):
        v=0
        ii=0
        while ii<len(vett)-1:
                v=v+vett[ii]
                ii=ii+1
        v=v+vett[len(vett)-1]
        vm=v/(len(vett))
        return vm

def errorevm(dvett):
        w=0
        jj=0
        while jj<len(dvett)-1:
                w=w+(dvett[jj])**2
                jj=jj+1
        w=w+(dvett[len(dvett)-1])**2
        if len(dvett)>0:
                evm=math.sqrt(w/(len(dvett)))
        else:
                evm=0
        return evm

n=0
VELOCITA=[0]*len(gran)
DELTAVEL=[0]*len(gran)
for q in gran:
        velox=[]
        dvelox=[]
        r=0
        while r<len(lat)-1:
                velox.append(vel[r])
                dvelox.append(dvel[r])
                r=r+q
        velox.append(vel[len(vel)-1])
        dvelox.append(dvel[len(dvel)-1])
        VELOCITA[n]=velocitamedia(velox)
        DELTAVEL[n]=errorevm(dvelox)
        n=n+1

ERRORE2D=[0]*len(gran)
n=0
for q in gran:
        errore_2dim=0
        h=0
        while h<(len(lat)-1) and h+q<(len(lat)-1):
                if percorso2[h][2:4]==percorso2[h+q][2:4]:
                        errore_2dim=errore_2dim
                else:
                        errore_2dim=errore_2dim + (errore2dim(h,h+q))*(errore2dim(h,h+q))
                h=h+q
        if h!=0:
                errore_2dim=errore_2dim + (errore2dim(h-q,len(lat)-1))*(errore2dim(h-q,len(lat)-1))
        elif h==0:
                errore_2dim=errore_2dim + (errore2dim(h,len(lat)-1))*(errore2dim(h,len(lat)-1))

        ERRORE2D[n]=math.sqrt(errore_2dim)
        n=n+1

print ERRORE2D


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

print "I vettori di distanza 2d e errore 2d in metri sono"
print DISTANZA2D
print ERRORE2D
print "I vettori di distanza 3d e errore 3d in metri sono"
print DISTANZA3D
print ERRORE3D
print "I vettori di velocita' e errore in kilometri orari sono"
print VELOCITA
print DELTAVEL


for f in range(len(gran)):
	print "In corrispondenza del parametro gran=",gran[f], "abbiamo", punti[f] ,"punti"
#Grafico
if inizio!=fine:
	theme.get_options()
	theme.output_format="png"
	theme.output_file="/Users/labo/labo_www/pic1.png"
	theme.reinitialize()
	data2D = [[gran[0], DISTANZA2D[0], ERRORE2D[0]], [gran[1], DISTANZA2D[1], ERRORE2D[1]], [gran[2], DISTANZA2D[2],ERRORE2D[2]]]
	data3D=[[gran[0], DISTANZA3D[0], ERRORE3D[0]], [gran[1], DISTANZA3D[1], ERRORE3D[1]], [gran[2], DISTANZA3D[2],ERRORE3D[2]]]
	size2D=(300,200)

	xaxis = axis.X(format="%d", label="Numero dei Punti")
	yaxis = axis.Y(format="%d",label="Distanza Percorsa 2D")

	ar = area.T(size=size2D,x_axis=xaxis, y_axis=yaxis, y_range=(0,max(DISTANZA2D)+min(DISTANZA2D)),x_range=(0,7),y_grid_style=None,y_grid_interval=int((max(DISTANZA2D))/10))

	plot = line_plot.T(label="distanza percorsa 2D", data=data2D, ycol=1, tick_mark=tick_mark.star)
	ar.add_plot(plot)
	ar.draw()
	yyaxis = axis.Y(offset=300, label_offset=(50, 0),label="Errore 2D")
	ar = area.T(size=size2D,x_axis=xaxis, y_axis=yyaxis, y_range=(0,int(max(ERRORE2D)+min(ERRORE2D))),x_range=(0,7),y_grid_interval=int((max(ERRORE2D))/10),y_grid_style=None,legend = legend.T(loc=(330, -15)))
	plot2 = line_plot.T(label="errore 2D", data=data2D, ycol=2, tick_mark=tick_mark.square)
	ar.add_plot(plot2)
	ar.draw()



# passa al grafico in 3 dimensioni
	size3D=(300,200)
	x3Daxis = axis.X(format="%d", label="Numero dei Punti")
	y3Daxis = axis.Y(format="%d",label="Distanza Percorsa 3D")
	ar_3D = area.T(size=size3D,x_axis=x3Daxis, y_axis=y3Daxis, y_range=(0,int(max(DISTANZA3D)+min(DISTANZA3D))),x_range=(0,7),y_grid_style=None,y_grid_interval=int((max(DISTANZA3D))/10),loc=(0,-300))
	plot3= line_plot.T(label="distanza percorsa 3D", data=data3D, ycol=1, tick_mark=tick_mark.star)
	ar_3D.add_plot(plot3)
	ar_3D.draw()
	y3D1axis=axis.Y(offset=300,label_offset=(50, 0),label="Errore 3D")
	ar_3D = area.T(size=size3D,x_axis=xaxis, y_axis=y3D1axis,x_range=(0,7), y_range=(0,int(max(ERRORE3D)+min(ERRORE3D))),y_grid_style=None,y_grid_interval=int((max(ERRORE3D))/10), loc=(0,-300), legend=legend.T(loc=(330,-315)))
	plot4 = line_plot.T(label="errore 3D", data=data3D, ycol=2, tick_mark=tick_mark.square)
	ar_3D.add_plot(plot4)
	ar_3D.draw()
else:
	print "Non e' possibile analizzare un percorso costituito di un solo punto. Inserisci due date diverse."
mdb.close()
