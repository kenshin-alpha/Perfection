x = [[1,2,3],
     [3,4,5],
     [5,6,7]]

y = [[9,8,7],
     [7,6,5],
     [5,4,3]]


result = [ [ x[i][j] + y[i][j] for j in range(len(x[0]))] for i in range(len(x))]

print(result)

x = [2,3,4,1]

result = ["True" for i in x  if i %2 == 0]

print(result)

result = ["True" if i%2==0 else "False" for i in x]

print(result)


letters = list(map(lambda x:x, "hello"))
print(letters)