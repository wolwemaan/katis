
while True:
	mset = set() 
	nset = set()
	# Read the controller line containing m and n into a line, 
	line=str(raw_input())

        # Break out if both are 0
	if line == "0 0":
		break

        # Split into a str col
	col = line.split()
	
	for i in range(0, int(col[0])):
		nset.add(int(raw_input()))
	for i in range(0, int(col[1])):
		mset.add(int(raw_input()))
   
	# Print the length of the intersection set, see:
	# https://www.programiz.com/python-programming/set
	print (len(mset & nset))


