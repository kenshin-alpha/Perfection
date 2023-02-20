def twosum(target,nums):
    di = {}
    for i,num in enumerate(nums):
        if(target - num in di):
            return [di[target - num], i]
        di[num] = i
    return []


    # for i in range(0,len(nums)):
    #     for j in range(0,len(nums)):
    #         if(i!=j):
    #             if(nums[j] == target - nums[i]):
    #                 return [i,j]
    
print(twosum(9,[2,7,11,15]))
