# Perform calculation by expecting the interval lenght (interval)
# as well as the multiplier and the percentage(p)
def calc(interval, multiply, p):
	return interval * (100 + (multiply * p)) / 100

while True:
	try:
		# Reads 3 numbers from input and typecasts them to int using  
		# list comprehension, invalid input will throw an exception which
		# the block will catch and then break out of the loop 
		n, p, k = [int(i) for i in input().split()] 
		col = [int(i) for i in input().split()] 

		ct = last = 0
		tot = float(0)
		for i in col:
			val = i - last
			tot += calc(val, ct, p)
			last = i
			ct += 1
		val = k - last
		tot += calc(val, ct, p)

		print(tot)
	except:
		break
