class Solution:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        prefix = strs[0]
        length = len(prefix)
        i = 0

        for word in strs:
            while i < len(prefix) and i < len(word) and word[i] == prefix[i]:
                i += 1
            prefix = prefix[:i]
            i = 0

        return prefix

            
            