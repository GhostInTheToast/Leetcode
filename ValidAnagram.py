class ValidAnagram:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        letterMap = defaultdict(int)
        for i in range(0, len(s)):
            letterMap[s[i]] += 1
            letterMap[t[i]] -= 1
        
        for value in letterMap.values():
            if value != 0:
                return False
        return True
        
