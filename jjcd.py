while True:
	m = raw_input()
	if m == "0 0":
		break
	col = [int(x) for x in m.split()]
		
	# Read numbers for n and m respectively and add them to set collections 
	for i in range(2, col[0] + 2):
		col.append(input())
	ctr=0
	for i in range(0, col[1]):
		if input() in col:
			ctr+=1
	print (ctr)
