class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        count = defaultdict(int)
        max_num = max_count = 0
        for n in nums:
            count[n] += 1
            if max_count < count[n]:
                max_count = count[n]
                max_num = n

        return max_num


        