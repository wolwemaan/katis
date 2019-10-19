def runtest(nums, order):
	nums.sort()
	#print(nums)
	#print(order)
	new = ["", "", ""]
	for i in range(0, 3):
		setnew = 0
		if order[i] == "B":
			setnew = 1
		elif order[i] == "C":
			setnew = 2
		new[i] =  str(nums[setnew])
	print (" ".join(new))

# 2nd arg split a string into a char array
runtest([int(i) for i in input().split()], list(input()))
