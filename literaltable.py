label = ['PROGRAM','-','-','-','DATA1','-','FOUR','FIVE','TEMP','-']
instructions = ['START','USING','A','A','EQU','ST','DC','DC','DS','END']
op1 = ['0','*','1','2','F10','1','F4','F5','1F','-']
op2 = ['0','15','FOUR','FIVE','-','=F4','-','-','-','-']
lc = 0
flag = 1
index = 0
for i in range(3,len(label)):
    
    if instructions[i]=="A" or instructions[i]=="DC" or instructions[i]=="DS" or instructions[i]=="END" or instructions[i]=="ST" :
        lc = lc+4
    word = op2[i]
    
    xy = word[0]
    if(xy=="="):
        index = i
        flag = 1

print("--------------------------Literal Table-----------------------------")
if(flag==1):
    print("Name", end="\t")
    print("Value", end="\t")
    print("Length", end="\t")
    print("R\A", end="\t")
    print(" ")
    print(op2[index],end='\t')
    print(lc,end='\t')
    print("4",end='\t')
    print("R",end='\t')
    print("")
    print("Location Count: ", lc)
