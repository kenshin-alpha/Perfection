def maxProfit(prices) -> int:
    st = []
    st.append(prices[0]) 
    max_difference = 0
    for i in prices:
        if(i<st[-1]):
            st.pop()
            st.append(i)
        diff = i - st[-1]
        if(max_difference < diff):
            max_difference = diff
    return max_difference 

print(maxProfit([7,1,5,3,6,2]))