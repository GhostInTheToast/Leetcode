class LongestConsecutiveSequence:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) < 2:
            return len(nums)
        numSet = set(nums)
        currentLongest = 0
        
        for num in numSet:
            longest = 0
            if num - 1 not in numSet:
                while num in numSet:
                    num += 1
                    longest += 1
                currentLongest = max(currentLongest, longest)
                
        return currentLongest
