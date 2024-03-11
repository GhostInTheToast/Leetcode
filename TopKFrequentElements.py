class TopKFrequentElements:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        count = defaultdict(int)
        buckets = [[] for i in range(len(nums) + 1)] # must do plus 1 because the actual array 
        ans = []                                     # counts 0th index as one of the values
                                                     # ie: if len(nums)=20, then last index wood be 19
        for num in nums:
            count[num] += 1

        for key, value in count.items():
            buckets[value].append(key)
        
        for i in range(len(buckets) - 1, 0, -1):
            for n in buckets[i]:
                ans.append(n)
                if len(ans) >= k:
                    return ans
        return ans
