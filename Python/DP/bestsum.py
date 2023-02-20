def bestsum(target,numbers,memo = None):
    if memo is None:
        memo = {}
    if target in memo:
        return memo[target]
    if target == 0:
        return []
    if target < 0:
        return None
    
    smallestCombination = None
    
    for num in numbers:
        remainder = target - num
        remaindercombination = bestsum(remainder,numbers,memo)
        if(remaindercombination != None):
            remaindercombination.append(num)
            if(smallestCombination is None or len(remaindercombination) < len(smallestCombination)):
                smallestCombination = remaindercombination.copy()
            
        
    memo[target] = smallestCombination
    return smallestCombination

print(bestsum(7,[5,3,4,7]))
print(bestsum(300,[2,7]))