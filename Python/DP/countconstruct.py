def countconstruct(target,wordbank,memo = None):
    if memo is None:
        memo = {}
    if target in memo:
        return memo[target]
    if target == "":
        return True
    
    totalcount = 0

    for word in wordbank:
        if(target.find(word) == 0):
            suffix = target[len(word):]
            noOfWays = countconstruct(suffix,wordbank,memo)
            totalcount += noOfWays
    
    memo[target] = totalcount
    return totalcount
        
 

print(countconstruct("hello",["e","ll","ello","o","h"]))
print(countconstruct("hello",["e","ll","ello","o"]))
print(countconstruct("eeeeeeeeeeeeeee",["e","ee","eeee","eeeeeee"]))