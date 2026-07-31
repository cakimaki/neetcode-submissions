class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashMap = dict()

        for i, num in enumerate(nums):
            complement = target - num
            if num in hashMap:
                return [hashMap[num],i]
            hashMap.update({complement : i})

        return [0,0]
        