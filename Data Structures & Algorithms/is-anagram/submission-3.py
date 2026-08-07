class Solution:
    def isAnagram(self, s: str, t: str) -> bool:

        if(len(s)!=len(t)):
            print("hello")
            return False

        charmap = {}
        for c in s:
            charmap[c] = charmap.get(c,0)+1
        for c in t:
            if c not in charmap or charmap[c] == 0:
                return False
            charmap[c] -= 1;
        return True
        