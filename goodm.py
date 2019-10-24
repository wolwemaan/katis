k = (( 1, 4, 7 ), ( 2, 5, 8, 0 ), ( 3, 6, 9 ))
rowmem = 0
colmem = 0
def idacc(i):
    global rowmem
    global colmem
    istr = list(str(i))
    #print (istr)
    rowmem = 0
    colmem = 0
    for i in range(0, len(istr)):
        val = int(istr[i])
        if not ck(val):
            return False
    return True

def ck(val):
    global rowmem
    global colmem
    for r in range(rowmem, len(k)):
        for c in range(colmem, len(k[r])):
            if k[r][c] == val:
                rowmem = r
                colmem = c
                return True
    return False
n=int(input())
arr=[]
for i in range(0, n):
    arr.append(int(input()))
for value in arr:
    rowmem = 0
    colmem = 0
    dev=0
    for i in range(0, value):
        dev=value + i
        if idacc(dev): 
            break
        dev=value - i
        if dev > 0 and idacc(dev): 
            break
    print(dev)        
#print(idacc(451))