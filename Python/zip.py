# zip() function tales iterables (can be zero or more), aggregates them in a tuple 
# and retuns a tuple iterable
numbers = [1,2,3]
words = ["one","two","three"]

combine = zip(numbers,words)
print(list(combine))

# if a iterable has less number of values the resulting zip object 
# contains values upto values from each iterable
numbers = [1,2,3]
name = ["one","two","three"]
caps = ["ONE","TWO","THREE","FOUR"]

names = list(zip(numbers,name))
print(names)
names = list(zip(numbers,name,caps))
print(names)

# UnZipping zip
comb =  list(zip(numbers,words))
c, v = zip(*comb)

print(c)
print(v)