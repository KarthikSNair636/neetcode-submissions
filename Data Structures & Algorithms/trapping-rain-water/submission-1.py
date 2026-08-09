class Solution:
    def trap(self, height: List[int]) -> int:
        i = 0
        j = len(height) - 1

        L = height[i]
        R = height[j]

        rt = 0

        while j>=i:
            if height[j] >= height[i]:
                summ = L - height[i]
                if summ > 0:
                    rt += summ
                L = max(L,height[i])
                i += 1
            else:
                summ = R - height[j]
                if summ > 0:
                    rt += summ
                R = max(R,height[j])
                j -= 1
        return rt