import sqlite3
def find_details_db(id2find): #valore int()
	db = sqlite3.connect("surfersDB.sdb")
	db.row_factory = sqlite3.Row
	cursor = db.cursor()
	cursor.execute("select * from surfers")
	rows = cursor.fetchall() #tipo lista
	for row in rows:
		s={}
		if row["id"]==id2find: #se c'è corrispondenza crea l'hash
			s["id"]=str(row["id"])
			s["name"]=row["name"]
			s["country"]=row["country"]
			s["average"]=str(row["average"])
			s["board"]=row["board"]
			s["age"]=str(row["age"])
			cursor.close()
			return(s)
	cursor.close()
	return({})
lookupid=int(input("Enter the id of the surfer: "))
surfer=find_details_db(lookupid)
if surfer: #se c'è un risultato buono (diverso da {})
	print("ID: " + surfer['id'])
	print("Name: " + surfer['name'])
	print("Country: " + surfer['country'])
	print("Average: " + surfer['average'])
	print("Board type: " + surfer['board'])
	print("Age:" + surfer['age'])
