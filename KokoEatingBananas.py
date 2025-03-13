class KokoEatingBananas:
    def minEatingSpeed(self, piles: List[int], h: int) -> int:
        
        low, high = ceil(sum(piles)/h), max(piles)

        if len(piles) == h:
            return high

        low, high = 1, max(piles)

        while low <= high:
            k = (low+high) // 2
            currentH = 0

            for pile in piles:
                currentH += (pile // k) + 1 if pile % k else pile // k

            
            if currentH > h:
                low = k + 1
            else:
                high = k - 1

        return low


# https://leetcode.com/problems/koko-eating-bananas/
