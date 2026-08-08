class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        lp = prices[0]
        prof = 0

        for i in range(1,len(prices)):
            if lp > prices[i]:
                lp = prices[i]
            else:
                cur = prices[i] - lp
                prof = max(prof,cur)
        return prof