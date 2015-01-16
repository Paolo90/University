result_f=open("/home/paolo/Documenti/Programmi Python/chapter 4/results.txt") #se il path contiene spazi riportarli senza problemi. Le virgolette mettono a posto.
best=0 #non posso lavorare con i valori di result_f tutti insieme. Devo separarli.
for each_line in result_f:
	each_line=each_line[each_line.find(' ')+1:each_line.find(' ')+5] #cerca l'indice relativo allo spazio
	each_line=float(each_line)
	if each_line>best:
		best=each_line
print("The best result is",best)
result_f.close()#chiude il file quando ho finito di lavoraci
