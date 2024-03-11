class 3Sum:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans = set()
        nums.sort()
        for i in range(len(nums)-2):
            j = i + 1
            k = len(nums) - 1
            while j < k:    
                if nums[i] + nums[j] + nums[k] == 0:
                    ans.add((nums[i], nums[j], nums[k]))
                    j += 1
                    k -= 1
                elif nums[i] + nums[j] + nums[k] > 0:
                    k -= 1
                else:
                    j += 1
                
        return ans
