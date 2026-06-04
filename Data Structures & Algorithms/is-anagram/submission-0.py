class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t): 
            return False
        s_set, t_set = {}, {}

        for (i,c) in enumerate(s):
            s_set[c] = s_set[c] + 1 if c in s_set else 1
            t_set[t[i]] = t_set[t[i]] + 1 if t[i] in t_set else 1
        
        print(s_set)
        print(t_set)


        for k in s_set:
            if k not in t_set or t_set[k] != s_set[k]:
                return False

        return True
