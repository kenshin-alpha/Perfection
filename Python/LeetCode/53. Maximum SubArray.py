
# Kadane's Algorithm

def maxSubArray(nums):
    """
    :type nums: List[int]
    :rtype: int
    """
    max_till_now = 0
    max_ending = 0
    for i in nums:
        max_ending = max_ending + i
        if(max_ending < 0):
            max_ending = 0
        if(max_till_now < max_ending):
            max_till_now = max_ending
    if(max_till_now == 0):
        return max(nums)
    return max_till_now

print(maxSubArray([-2,1,-3,4,-1,2,1,-5,4]))