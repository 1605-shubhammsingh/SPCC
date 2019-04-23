label = ['SAMPLE','-','-','TEMP','FOUR','-']
instructions = ['START','USING','A','EQU','DC','END']
op1 = ['0','*','1','10','F','-']
op2 = ['-','15','FOUR','-','4','-']
lc1 = 0
print("Name", end='\t')
print("Value", end='\t')
print("Length", end='\t')
print("R/A", end='\t')
print()
for i in range(0,len(label)):
    if(label[i]!='-'):
        print(label[i],end="\t")
        if(label[i]=='FOUR' or label[i]=='FIVE' or label[i]=='TEMP'):
            print(lc1, end="\t")
        else:
            print(op1[i], end="\t")
        
        if(label[i]=='PROGRAM'):
            print(1,end="\t")
        else:
            print(4,end="\t")
        if(label[i]=='DATA1'):
            print("A",end="\t")
        else:
            print("R", end="\t")
        print(" ")

    if(instructions[i]=='ADD' or instructions[i]=='ST' or instructions[i]=='DC' or instructions[i]=='DS'):
        lc1=lc1+4