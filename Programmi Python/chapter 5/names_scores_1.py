result_f=open("/home/paolo/Documenti/Programmi Python/chapter 4/results.txt")
scores=[]
names=[]
for each_line in result_f:
	(name,score)=each_line.split()
	scores.append(float(score))
	names.append(name)
scores.sort(reverse=True)
names.sort(reverse=True)
print("The highest scores were:")
print(names[0]+'with'+scores[0])
print(names[1]+'with'+scores[1])
print(names[2]+'with'+scores[2])
