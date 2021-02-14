"""
Tag: String
Difficulty: Easy
"""
class Solution:
    def firstUniqChar(self, s: str) -> int:
        sList = list(s)
        for i in range(0, len(s)):
            choosenChar = sList.pop(i)
            if choosenChar not in sList:
                return i
            sList.insert(i, choosenChar)
        return -1

"""

"""
