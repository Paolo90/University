#The module works when you type an integer. It returns True, if the code is right, else False.
#Paolo Piersanti
def Luhn(credit_card):
	if type(credit_card)==type(1) and len(str(credit_card))==16 and str(credit_card)!="0000000000000000": #se il codice è valido allora vale la formula di luhn ma il viceversa non è vero. Vale il viceversa se escludo l'unico controesempio che è il codice nullo.
		L=0
		index=15
		B=str(credit_card)
		while index>=0:
			if index%2==0:
				A=int(B[index])*2
				if A>=10:
					A=str(A)
					L=L+int(A[0])+int(A[1])
				else:
					L=L+A
			else:
				L=L+int(B[index])
			index=index-1
	else:
		print("Input Error")
		return 0	
	if L%10==0:
		print("Valid Credit card code")
		return 1
	else:
		print("Wrong Credit card code")
		return 0
#print(Luhn(4023600466624535))
