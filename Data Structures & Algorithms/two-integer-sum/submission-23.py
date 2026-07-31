class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        diff = dict()

        for i, num in enumerate(nums):
            complement = target - num
            if complement in diff:
                return [diff[complement], i]
            diff[num] = i

        return [0,0]