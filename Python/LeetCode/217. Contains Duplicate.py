def containsDuplicate(nums):
    """
    :type nums: List[int]
    :rtype: bool
    """
    di = {}
    for i in nums:
        if(i in di):
            return True
        di[i] = 1
    return False


print(containsDuplicate([1,2,3,4,1]))
print(containsDuplicate([1,2,3,4]))