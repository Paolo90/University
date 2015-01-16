import urllib.request
import time
def get_price():
	page=urllib.request.urlopen("http://www.beans-r-us.biz/prices.html")
	text=page.read().decode("utf8")
	where=text.find(">$")
	start_of_price=where+2
	end_of_price=start_of_price+4
	#print(text[start_of_price:end_of_price]) il dato del prezzo in questo modo non può essere utilizzato
	return(text[start_of_price:end_of_price]) #prendo il dato per poterlo riusare successivamente
ask=input("Do you need the priceimmediately? (Y/N) ")
if ask=="Y":
	print(get_price())
else:
	price=99.99
	while price > 4.74:
		time.sleep(900) #attende 15 minuti tra una richiesta e la successiva
		#ricarica la pagina ogni volta che viene eseguito il loop-body
		page=urllib.request.urlopen("http://www.beans-r-us.biz/prices-loyalty.html")
		text=page.read().decode("utf8")
		#col metodo find() cerchiamo la stringa di caratteri ">$"
		price=text[text.find(">$")+2:text.find(">$")+6]
		price=float(price)
	print(price) #voglio sapere quando comprare sotto $4.74	
