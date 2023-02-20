def cansum(target, data,memo= None):
    if memo == None:
        memo = {}
    if target in memo:
        return memo[target]
    if target == 0:
        return True
    if target < 0:
        return False
    
    for i in data:
        remainder = target - i
        if(cansum(remainder, data,memo) == True):
            memo[target] = True
            return True
    memo[target] = False
    return False


print(cansum(12,[2,3,2,5,6]))

print(cansum(23,[5,10]))


