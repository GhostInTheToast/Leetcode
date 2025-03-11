class ContainerWithMostWater:
    def maxArea(self, height: List[int]) -> int:
        low = 0
        high = len(height) - 1

        maxWater = 0

        while low < high:
            width = high - low
            if height[low] < height[high]:
                currentWater = width * height[low]
            else:
                currentWater = width * height[high]
            maxWater = (currentWater if currentWater > maxWater else maxWater)
            if (height[low] < height[high]):
                low += 1
            else:
                high -= 1

        return maxWater

  # https://leetcode.com/problems/container-with-most-water/
