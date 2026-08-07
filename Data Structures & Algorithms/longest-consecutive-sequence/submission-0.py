class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        longest_streak = 0
        num_map = set(nums)
        for n in nums:
            if n-1 not in num_map:
                current = n
                streak = 1
                while current+1 in num_map:
                    current += 1
                    streak += 1
                longest_streak = max(streak,longest_streak)
        return longest_streak
