def save_transaction(price,credit_card,description): #float, int, string
	file=open("transactions.txt","a") # l'opzione "a" vuol dire che aggiungerai le nuove righe sempre in fondo al file che creo col nome transaction.txt
	file.write("%07d%s%s\n" % (price * 100,credit_card,description))
	file.close()
