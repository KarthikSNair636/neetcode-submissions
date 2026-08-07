class Solution:
    def maxArea(self, heights: List[int]) -> int:
        i = 0
        j = len(heights) - 1
        rt = 0
        while i < j:
            if heights[i] < heights[j]:
                rt = max(rt,heights[i]*(j-i))
                i += 1
            else:
                rt = max(rt,heights[j]*(j-i))
                j -= 1
        return rt