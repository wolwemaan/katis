n = int(input())
for i in range(0,n):
	input()
	c = int(input())
	num = 0
	for j in range(0,c):
		num += int(input())
	print ("NO" if num % c else "YES")
