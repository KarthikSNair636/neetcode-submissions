class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        found = {}
        for n in nums:
            if n in found:
                return True
            found[n] = 1
        return False
        