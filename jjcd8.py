def getit(n):
	return input()

while True:
	# Read the controller line containing m and n into a line, 
	line=str(input())

        # Break out if both are 0
	if line == "0 0":
		break

        # Split into a str col
	col = line.split()
	
	nset = set(map(getit, range(0, int(col[0]))))
	mset = set(map(getit, range(0, int(col[1]))))
   
	# Print the length of the intersection set, see:
	# https://www.programiz.com/python-programming/set
	print (len(mset & nset))


