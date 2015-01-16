#!/usr/bin/python

import MySQLdb

# Open database connection
db = MySQLdb.connect("193.205.222.89","labo","lab0rat0r10","paolo" )

# prepare a cursor object using cursor() method
cursor = db.cursor()

# Drop table if it already exist using execute() method.
cursor.execute("DROP TABLE IF EXISTS raspy")

# Create table as per requirement
sql = """CREATE TABLE raspy (
         id INT UNSIGNED NOT NULL AUTO_INCREMENT,
         Time DATETIME,
         Latitude REAL,
         Longitude REAL,
	 Altitude REAL,
         Speed REAL,
         Lat_err REAL,
         Lon_err REAL,
         Alt_err REAL,
         Speed_err REAL,
         PRIMARY KEY (id)
          )"""
cursor.execute(sql)

# disconnect from server
db.close()

