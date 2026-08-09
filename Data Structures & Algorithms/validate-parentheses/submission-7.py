class Solution:
    def isValid(self, s: str) -> bool:
        val = 0

        op = ['(','{','[']
        stk = []

        for c in s:
            if c in op:
                stk.append(c)
            else:
                if not stk:
                    return False
                cur = stk.pop()
                if c == ')' and cur != '(':
                    return False
                if c == '}' and cur != '{':
                    return False
                if c == ']' and cur != '[':
                    return False
        if stk:
            return False
        return True