import itertools


data = [2,3,4,5,6,7]

li = itertools.permutations(data)

# for i in li:
#     print(i)

li = itertools.combinations(data)
for i in li:
    print(i)
    print(sum(i))


for i in range(1,5):
    li = itertools.combinations