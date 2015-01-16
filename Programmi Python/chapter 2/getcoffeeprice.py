import urllib.request #importa la libreria di gestione delle URL
page=urllib.request.urlopen("http://www.beans-r-us.biz/prices.html") #definisce page attraverso l'uso della funzione urlopen della libreria caricata e carica la pagina web indicata
text=page.read().decode("utf8") #definisce la variabile text chiedendo di leggere page e di scrivere a video con la decodifica utf8
#print(text) #stampa il testo della pagina web a video
print(text[234:238]) #stampa una sottostring corrispondente al prezzo cercato
