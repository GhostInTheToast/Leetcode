from typing import List

def getCommon(self, nums1: List[int], nums2: List[int]) -> int:
    hashset = set()
    load = nums1 if len(nums1) < len(nums2) else nums2
    for i in range(len(load)):
        hashset.add(load[i])
    load = nums2 if len(nums1) < len(nums2) else nums1
    for i in range(len(load)):
        if load[i] in hashset:
            return load[i]
    return -1;