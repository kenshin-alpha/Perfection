# n, m = map(int,input().split())
# coins = list(map(int,input().split()))
# dp = [1]+[0]*n
# for i in range(m): 
#     for j in range(coins[i], n+1): 
#         dp[j]+=dp[j-coins[i]]
#         print(dp)
# print(dp[-1])


def nonDivisibleSubset(k, s):
    r, o = [0] * k, 0                            
    for i in s:
        r[i % k] += 1  
    print(r)                          
    for j in range((k + 2) // 2):                
        if not j or not k % 2 and j == k // 2:
            o += r[j] > 0                        
        else:
            o += max(r[j], r[k - j])             
    return o
first_multiple_input = input().rstrip().split()
n = int(first_multiple_input[0])
k = int(first_multiple_input[1])
s = list(map(int, input().rstrip().split()))
result = nonDivisibleSubset(k, s)
print(result)