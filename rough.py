
import math

# A Group of modules is a package. In this case Python folder.
x = [2,3,2,4,2,3,7,5,0]



print(any(x))
print(all(x))





di = {
    "n" : [23,232,1,1],
    "g" : [43,123,22,90]
}

for i,v in di.items():
    print(i,v)

print(dir(math))

li = [['harry',2],['Hermione',1]]
li.sort(key= lambda x: x[1])
print(li)


print(1^1)
def howsum(targetSum,numbers,memo={}):
    for num in numbers:
        memo[num] = targetSum
    return memo


print(howsum(7,[2,3,4]))
print(howsum(8,[9,8,12]))
