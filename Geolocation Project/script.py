#!/usr/bin/python

import MySQLdb as mdb
import sys
import string


con = None


try:

    while True:
         con = mdb.connect('193.205.222.89', 'labo', 'lab0rat0r10', 'paolo')
         cur = con.cursor()

         cur.execute("SELECT VERSION()")

         data = cur.fetchone()

         print "Versione Database: %s " % data
         print "Connected to DATABASE"	
         print "start Session..."

         altitude = 334.5
         latitude = 12.456322
         longitude = 43.876541
         speed = 12.2

         cur.execute("INSERT INTO coordinate set alt=%s, lat=%s, lon=%s, sp=%s", (altitude, latitude, longitude,speed))
         con.commit() 
	  
except mdb.Error, e:
  
    print "Error %d: %s" % (e.args[0], e.args[1])
    sys.exit(1)

finally:
    
    if con:
        con.close()
