def find_details(id2find): #id2find è di tipo int()
	surfer_f=open("surfing_data.csv") #apre il file
	for each_line in surfer_f: #each_line è di tipo stringa
		s={} #ogni riga ha il suo dizionario
		(s["id"],s["name"],s["country"],s["score"],s["board"],s["age"])=each_line.split(";") #creo iterativamente il dizionario
		if id2find==int(s["id"]): #non creo una matrice-dizionario. Lavoro con un hash per volta.
			surfer_f.close()
			return(s) # se c'è corrsipondenza ritorno l'hash. Le chiamate successive non influenzano perché col return esco dalla funzione.
	surfer_f.close() #se c'è almeno una corrispondenza queste due righe non vengono eseguite.
	return({})
