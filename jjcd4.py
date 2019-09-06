while True:
	# Read the controller line containing m and n into a line, 
	line=input()

        # Break out if both are 0
	if line == "0 0":
		break

        # Split into a str array
	arr = line.split()
	
	# Read numbers for n and m respectively and add them to set collections 
	
	nmax = int(arr[0])
	string = ""
	for i in range(0, int(arr[1]) + nmax):
		string += input() + " "
	arr = string.split()
	mset = set(arr[0:nmax])
	nset = set(arr[nmax:])
	# Print the length of the intersection set, see:
	# https://www.programiz.com/python-programming/set
	print (len(mset & nset))

