class twoSumSorted:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        low = 0
        high = len(numbers) - 1 

        while low < high:
            if numbers[low] + numbers[high] > target:
                high -= 1
            elif numbers[low] + numbers[high] < target:
                low += 1
            if numbers[low] + numbers[high] == target:
                return [low+1, high+1] 
        return [low+1, high+1] 


# https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
