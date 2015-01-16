import urllib.request
page=urllib.request.urlopen("http://www.beans-r-us.biz/prices-loyalty.html")
text=page.read().decode("utf8")
#col metodo find() cerchiamo la stringa di caratteri ">$"
price=text[text.find(">$")+2:text.find(">$")+6]
print(price)
