num = 70
for i in range(2,num):
    if(num%i == 0):
        print("Not a Prime")
        break
else:
    print("Prime")