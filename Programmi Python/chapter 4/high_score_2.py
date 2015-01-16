result_f=open("results.txt")
high_score=0
for each_line in result_f:
	(name, score)=each_line.split() #name e score sono delle stringhe
	if float(score)>high_score:
		high_score=float(score)
print("The highest score is ", high_score)#mostro solo il punteggio del vincitore
result_f.close()#chiudo il file
