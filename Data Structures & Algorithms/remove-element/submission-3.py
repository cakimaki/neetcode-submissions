class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        i = 0
        k = 0
        for j, n in enumerate(nums):
            if n != val:
                nums[i], nums[j] = nums[j], nums[i]
                i += 1
                
        print(nums)
        return i