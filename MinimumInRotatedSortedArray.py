class MinimumInRotatedSortedArray:
    def findMin(self, nums: List[int]) -> int:
        
        low = 0
        high = len(nums) - 1

        if nums[low] <= nums[high]:
            return nums[low]

        while low <= high:
            middle = (low+high) // 2
            if middle > 0 and nums[middle] < nums[middle - 1]:
                return nums[middle]
            if nums[middle] > nums[high]:
                low = middle + 1
            else:
                high = middle - 1

# https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
