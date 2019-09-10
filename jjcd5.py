while True:
	# Read the controller line containing m and n into a line, 
	line=input()

        # Break out if both are 0
	if line == "0 0":
		break

        # Split into a str array
	arr = line.split()
	
	# Read numbers for n and m respectively and add them to set collections 
	arr2 = []
	for i in range(0, int(arr[0])):
		arr2.append(input())
	ctr=0
	for i in range(0, int(arr[1])):
		if input() in arr2:
			ctr+=1
	print (ctr)

