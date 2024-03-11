class GroupAnagrams:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        hmap = defaultdict(list)
        for str in strs:
            sortedStr = ''.join(sorted(str))
            hmap[sortedStr].append(str)
        
        return list(hmap.values())
