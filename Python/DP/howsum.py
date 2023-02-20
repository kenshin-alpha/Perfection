def howsum(target, numbers,memo = None):
    if(memo == None):
        memo = {}
    if(target in memo):
        return memo[target]
    if(target == 0):
        return []
    if(target < 0 ):
        return None
    
    for num in numbers:
        remainder = target - num
        remainderresult = howsum(remainder,numbers,memo)
        if(remainderresult != None):
            remainderresult.append(num)
            memo[target] = remainderresult
            return memo[target]
        
    memo[target] = None

    return None

print(howsum(300,[7,15]))
print(howsum(7,[2,3]))

print(howsum(18,[7,3]))
print(howsum(7,[2,3]))