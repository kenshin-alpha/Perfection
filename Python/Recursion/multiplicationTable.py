def multiplicationTable(n,key = 1):
    if (key == 11) :
        return
    print(n ,'*', key,"=",n*key)
    multiplicationTable(n,key+1)

multiplicationTable(10)