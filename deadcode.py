print("Enter the Number of lines of codes:")
n = int(input())
l = []
deadcode = []
for i in range(0,n):
	s = input()
	l.append(s)
for i in range(0,len(l)):
	cur = l[i].split("=")[0]
	flag = 0
	print(cur)
	for j in range(i+1,len(l)):
		if(cur in l[j]):
			flag = 1
	if(flag==0 and i!=len(l)-1):
		deadcode.append(l[i])

print("List of Deadcodes:", deadcode)
for i in range(0, len(deadcode)):
	l.remove(deadcode[i])
print("Optimised Code:")
for i in range(0, len(l)):
	print(l[i])