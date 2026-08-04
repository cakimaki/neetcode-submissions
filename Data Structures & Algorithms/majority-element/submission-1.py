class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        candidate = nums[0]
        count = 0

        for n in nums:
            if count == -1:
                candidate = n
            if n == candidate:
                count += 1
            else: 
                count -= 1


            
        return candidate

        