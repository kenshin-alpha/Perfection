def intersect(nums1, nums2):
        result = []
        for i,num in enumerate(nums1):
            if(num in nums2):
                nums1[i] = 's'
                y = nums2.index(num)
                nums2[y] = 's'
                result.append(num)

        return result

print(intersect([1,2,2,3],[2,2,5]))