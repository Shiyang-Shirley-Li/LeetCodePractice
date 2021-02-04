"""
Tag:String
Difficulty: easy
"""

class Solution:
    def strStr(self, haystack: str, needle: str) -> int:
        if needle not in haystack:
            return -1
        elif haystack == "" or needle == "":
            return 0
        else:
            index = 0
            for item in needle:
                for character in haystack:
                    if item == character and needle == haystack[index: len(needle)+index]:
                        return index
                    else:
                        index+=1
"""
Conclusion:
  1. substring of string: [startIndex: endIndex+1]
"""
