def save_transaction(price,credit_card,description): #float, int, string
	file=open("transactions.txt","a") # l'opzione "a" vuol dire che aggiungerai le nuove righe sempre in fondo al file che creo col nome transaction.txt
	file.write("%s%07d%s\n" % (credit_card, price * 100, description))
	file.close()
items = ["DONUT", "LATTE", "FILTER", "MUFFIN"]
prices = [1.50, 2.0, 1.80, 1.20]
running=True
while running:
	option=1
	for choice in items:
		print(str(option) + ". " + choice)
		option=option+1
	print(str(option) + ". Quit")
	choice=int(input("Choose an option: ")) #inserisci un numero intero da 1 a 5
	if choice==option: #cioè è uguale a 5 che corrisponde a quit
		running=False # chiude il programma
	else:
		credit_card=input("Credit card number: ") # se è una delle 4 precedenti conferma l'acquisto
		save_transaction(prices[choice - 1], credit_card,items[choice -1] )
