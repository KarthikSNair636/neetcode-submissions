class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res = []
        size = len(nums) - 1

        for i in range(len(nums) - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            
            left, right = i + 1, size
            target = -nums[i]

            while right > left:
                total = nums[left] + nums[right]
    
                if total == target:
                    res.append([nums[i],nums[left],nums[right]])
                    left += 1
                    right -=1

                    while left < right and nums[left] == nums[left - 1]:
                        left += 1
                    while left < right and nums[right] == nums[right + 1]:
                        right -= 1
                
                elif target > total:
                    left += 1
                else:
                    right -= 1

        return res