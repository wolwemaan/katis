def runtest(c):
	while True:
		j = [str(i) for i in input().split()]
		if j[0] == "what":
			print (" ".join(c))
			return
		else:
			c = [value for value in c if value != j[-1]]

for n in range(0, int(input())):
	runtest([str(i) for i in input().split()])
