mset = set() 
nset = set()

while True:
	# Read the controller line containing m and n into a line, 
	line=str(input(""))

        # Break out if both are 0
	if line == "0 0":
		break

        # Split into a str array
	arr = line.split()
	
	# Read numbers for n and m respectively and add them to set collections 
	
	for i in range(0, int(arr[0])):
		nset.add(int(input("")))
	
	for i in range(0, int(arr[1])):
		mset.add(int(input("")))
   
	# Print the length of the intersection set, see:
	# https://www.programiz.com/python-programming/set
	print (len(mset & nset))

	# Clear sets for next iteration
	mset.clear
	nset.clear

