
lc = ['SAMPLE','-','-','TEMP','FOUR','-']
ins = ['START','USING','A','EQU','DC','END']
op1 = ['0','*','1','10','F','-']
op2 = ['-','15','FOUR','-','4','-'] 
x = []
for i in range(0, len(ins)):
    if ins[i]=='USING':
        x.append(op2[i])
        x.append("Y")
        x.append(0)

for i in range(0, len(ins)):
    if ins[i]=="A" or ins[i]=="ST":
        ins[i]=4

print(ins)
print("-----------------------BASE TABLE----------------------")
print("a", end='\t')
print("b", end='\t')
print("c", end='\t')
print()
print(x[0],end='\t')
print(x[1],end='\t')
print(x[2],end='\t')