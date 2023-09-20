class Solution:
    def partitionString(self, s: str) -> int:
        listy=[]
        res=0
        for i in range(len(s)):
            if s[i] in listy:
                res+=1
                listy=[]
            listy.append(s[i])
        return res+1