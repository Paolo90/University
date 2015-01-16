result_f=open("results.txt")
scores={}
scores[8.45]="Joseph"
scores[8.65]="Johnny"
scores[7.81]="Stacey"
scores[8.05]="Aideen"
scores[7.21]="Zack"
scores[8.31]="Aaron"
scores[9.12]="Juan"
for key in scores.keys(): #mi muovo tra le chiavi col metodo keys()
	print(scores[key] + " got a score of " + str(key))
result_f.close()
