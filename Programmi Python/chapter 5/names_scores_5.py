scores={}
result_f=open("results.txt")
for each_line in result_f:
	(name,score)=each_line.split()
	scores[score]=name #per un array dovevo trasformare il punteggio da str a float. Con i dizionari ciò non va fatto.
#con questo for ho creato il dizionario. Prendo tutti i numeri da scores, li ordino e prendo i migliori 3 risultati
for each_score in sorted(scores.keys(),reverse=True):
	print("Surfer " + scores[each_score]+ " got a score of " + each_score)
result_f.close()
#In questo modo ho la classifica come richiede l'esercizio.
