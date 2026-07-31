class Solution:
    def getConcatenation(self, nums: List[int]) -> List[int]:
        # ans = 2 * nums.len
        length = len(nums)
        ans = [0] * length * 2 

        for i, num in enumerate(nums):
            ans[i] = nums[i]
            ans[i + length] = nums[i]
        
        return ans

        
        