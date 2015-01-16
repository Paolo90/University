import urllib.request
import time
price=99.99
while price > 4.74:
	time.sleep(900) #attende 15 minuti tra una richiesta e la successiva
	#ricarica la pagina ogni volta che viene eseguito il loop-body
	page=urllib.request.urlopen("http://www.beans-r-us.biz/prices-loyalty.html")
	text=page.read().decode("utf8")
	#col metodo find() cerchiamo la stringa di caratteri ">$"
	price=text[text.find(">$")+2:text.find(">$")+6]
	price=float(price)
print("Buy!") #voglio sapere quando comprare sotto $4.74
