"""
Tag: String
Difficulty: Easy
"""
class Solution:
    def isPalindrome(self, s: str) -> bool:
        regex = re.compile('[^A-Za-z0-9]')
        s = regex.sub('', s)
        s = s.lower()
        sHalfLen = len(s) // 2
        
        index = len(s) - 1
        for i in range(0, sHalfLen):
            print(s[i])
            print(s[index])
            if s[i] != s[index]:
                return False
            index -= 1
        
        return True

"""
Conclusions:
1. regex in python. compile(pattern). sub(pattern, string)
"""
