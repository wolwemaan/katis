
while True:
	# Read the controller line containing m and n into a line, 
	line=str(input())

        # Break out if both are 0
	if line == "0 0":
		break

	mset = set() 
	nset = set()

        # Split into a str col
	col = line.split()
	
	for i in range(0, int(col[0])):
		nset.add(int(input()))
	for i in range(0, int(col[1])):
		mset.add(int(input()))
   
	# Print the length of the intersection set, see:
	# https://www.programiz.com/python-programming/set
	print (len(mset & nset))


