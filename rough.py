
import math
import os
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
def duplicate(nums):
    di = {}
    for i in nums:

        if(i in di.keys()):
            return "true"
        di[i] = 1
    return "false"

print(duplicate([1,2,3,4,2]))

def merge( nums1, m: int, nums2, n: int) -> None:
    """
    Do not return anything, modify nums1 in-place instead.
    """
    i = 0
    j = 0
    while(nums1[-1] == 0):
        nums1.pop()
    while(i != len(nums1)):
        # if (len(nums2) == 0):
        #     break
        if(nums2[j]<=nums1[i]):
            nums1.insert(i,nums2[j])
            j+=1
        if(len(nums2) == j):
            break
        i+=1
        
    # if(len(nums1) != n+m):
    #     diff = len(nums1)-m
    #     for i in range(diff,len(nums2)):
    #         nums1.append(nums2[i])


            

    print(nums1)

li = [-1,-1,0,0,0,0]
lf = [-1,0]
merge(li,6,lf,2)
print(li)

def matrixReshape( mat, r: int, c: int):
    actual = []
    for i in mat:
        for j in i:
            actual.append(j)
    result = []
    print(actual)

    k = 0
    for i in range(r):
        li = []
        for j in range(c):
            li.append(actual[k])
            k += 1
        result.append(li)
    return result

print(matrixReshape([[1,2],[3,4]], 2,4))

st = "shld"
st