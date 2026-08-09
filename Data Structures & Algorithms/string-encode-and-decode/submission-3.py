class Solution:

    def encode(self, strs: List[str]) -> str:
        res = ""
        for s in strs:
            res =  res + str(len(s)) + "#" + s 
        return res       
    def decode(self, s: str) -> List[str]:
        res = []
        leng = 0
        c = 0
        while c < len(s):
            j = c
            while s[j] != '#':
                j += 1
            leng = int(s[c:j])
            res.append(s[j + 1 : j + 1 + leng])
            c = j + 1 + leng
        return res
