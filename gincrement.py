n = int(input())
lst = [int(x) for x in input().split()]

ctr = 0;
now = 0;
no = 0;
string = ""
for i in lst:
	if i > now:
		string+=' '
		string+=str(i);
		now = i;
	else:
		no+=1;
	ctr+=1
print(ctr - no);
print(string[1:])
#string.delete(0, 1);
#System.out.println(string);
