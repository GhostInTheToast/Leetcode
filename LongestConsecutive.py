class LongestConsecutive:
    def longestConsecutive(self, nums: List[int]) -> int:
        numSet = set(nums)
        maximum = 0
        print(len(nums))
        for num in nums:
            currentMax = 0
            if (num - 1) in numSet:
                continue
            else:
                for i in range(len(nums)):
                    if (num + i in numSet):
                        currentMax += 1
                        if currentMax >= len(nums)/2 and (num+i+1) not in numSet:
                            return currentMax
                    else:
                        break
                if currentMax > maximum:
                    maximum = currentMax
        
        return maximum

          # needs some improvement. kinda slow runtime
