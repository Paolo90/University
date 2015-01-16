def find_details(id2find): #id2find è di tipo int()
	surfer_f=open("surfing_data.csv") #apre il file
	for each_line in surfer_f: #each_line è di tipo stringa
		s={} #ogni riga ha il suo dizionario
		(s["id"],s["name"],s["country"],s["score"],s["board"],s["age"])=each_line.split(";") #creo iterativamente il dizionario
		if id2find==int(s["id"]): #non creo una matrice-dizionario. Lavoro con un hash per volta.
			surfer_f.close()
			return(s) # se c'è corrsipondenza ritorno l'hash. Le chiamate successive non influenzano perché col return esco dalla funzione.
	surfer_f.close() #se c'è almeno una corrispondenza queste due righe fuoridal for non vengono eseguite.
	return({})
lookupid=int(input("Enter the id of the surfer: "))
surfer=find_details(lookupid)
if surfer: #se c'è un risultato vero se è diverso da {} o vuoto
	print("ID: " + surfer['id'])
	print("Name: " + surfer['name'])
	print("Country: " + surfer['country'])
	print("Average: " + surfer['score'])
	print("Board type: " + surfer['board'])
	print("Age:" + surfer['age'])
