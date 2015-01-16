result_f=open("results.txt")
score=[]
for each_line in result_f:
	(names,scores)=each_line.split()
	score.append(float(scores))
score.sort() #la variabile score allo stato grezzo non mi serve più allora ordino senza problemi in modo crescente
score.reverse()
print("The first three scores are:")
print(score[0])
print(score[1])
print(score[2])
result_f.close()
