result_f=open("results.txt")
score=[]#array vuoto
for each_line in result_f:
	(names,scores)=each_line.split()
	score.append(scores) #aggiungo delle stringhe non dei numeri
print(score[0], score[1], score[2]) #questi punteggi non sono ordinati
result_f.close()
