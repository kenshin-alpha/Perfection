def canconstruct(target,wordbank, memo = None):
    if memo == None:
        memo = {}
    if target in memo:
        return memo[target]
    if(target == ""):
        return True
    
    for word in wordbank:

        if(target.find(word) == 0):
            suffix = target[word.__len__():]
            if(canconstruct(suffix,wordbank,memo) == True):
                memo[target] = True
                return True
        
    memo[target] = False    
    return False




print(canconstruct("hello",["e","ll","ello","o","h"]))
print(canconstruct("hello",["e","ll","ello","o"]))
print(canconstruct("eeeeeeeeeeeeeeef",["e","ee","eeee","eeeeeee"]))