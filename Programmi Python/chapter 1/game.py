print("Welcome!")
g=1
while g!=5:
	g=input("Guess the number: ")
	g=int(g) #trasforma g in un numero intero. Di default python leggerebbe il valore passato da tastiera come una lettera
	if g<5:
		print("Too low")
	else:
		if g>5:
			print("Too much")
		else:
			print("You Win")
print("Game over!")
