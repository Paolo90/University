from random import randint
secret=randint(1, 10)
g=0
print("Welcome")
while g!=secret:
	g=input("Guess the number: ")
	g=int(g)
	if g<secret:
		print("Too low")
	else:
		if g>secret:
			print("Too much")
		else:
			print("You Win")
