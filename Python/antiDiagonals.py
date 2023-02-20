a = [[1,2,3],
     [4,5,6],
     [7,8,9]]

m = a.__len__()
n = a[0].__len__()

for i in range(m+n-1):
    for j in range(i+1):
        if(j>=m or i-j >= n):
            continue
        k = i - j
        print(a[j][k],end=" ")
    print()