line = "101;Johnny 'wave-boy' Jones;USA;8.32;Fish;21"
#ID=line[line.find(";")-3:line.find(";")] Prima versione del codice
#print("ID: " + ID)
#Name=line[line.find(";")+1:line.find(";")+24]
#print("Name: " + Name)
#country=line[line.find("U"):line.find("U")+3]
#print("Country: " + country)
#score=line[line.find("8"):line.find("8")+4]
#print("Socre: " + score)
#board=line[line.find("F"):line.find("F")+4]
#print("Board: " + board)
#age=line[line.find("21"):line.find("21")+2] #se metto solo line.find("2") mi si riferisce al 2 di 8.32
#print("Age: " + age)

#Seconda versione del codice con il metodo split()
(ID,Name,Country,Score,Board,Age)=line.split(";")
for key in (ID,Name,Country,Score,Board,Age):
	print(key)

#terza versione del codice metodo split + dizionario

s={}
(s["id"],s["name"],s["country"],s["score"],s["board"],s["age"])=line.split(";")
print("ID:" + s["id"])
print("Name: " + s["name"])
print("Score" + s["score"])
print("Board: " + s["board"])
print("Age" + s["age"]) 
