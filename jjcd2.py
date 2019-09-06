import re
mset = set() 
nset = set()
# Use a regular expression of any spaces. Text do not say if it is a space or tab
pattern = re.compile(r"\s+")

while True:
	# Read the controller line containing m and n, break out if both are 0
	line=str(input(""))
	arr = pattern.split(line)

	if str(arr[0]) is "0" and str(arr[1]) is "0":
		break

	# Convert from the string array to individual int variables
	n = int(arr[0])
	m = int(arr[1])
	
	# Read numbers for n and m respectively and store in set collections 
	
	for i in range(0, n):
	   nset.add(int(input("")))
	
	for i in range(0, m):
	   mset.add(int(input("")))
   
    # Print the length of the intersection set, see:
    # https://www.programiz.com/python-programming/set
	print (len(mset & nset))

	# Clear sets for next iteration
	mset.clear
	nset.clear

