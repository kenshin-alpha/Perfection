for i in range(1,9):
    k=9-i
    for space in range(k-1):
        print(" ",end="")
    for j in range(i):
        print("*",end="")
    for j in range(i-1):
        print("*",end="")
    print()
    