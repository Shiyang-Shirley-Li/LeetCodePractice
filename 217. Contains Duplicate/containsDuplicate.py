"""
Tag: Array
Difficulty: Easy
"""

class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        nums_set = set(nums)
        if len(nums_set) == len(nums):
            return False
        else:
            return True
           
 """
 Conclusion:
           1. False and True should be capitalized
           2. The smart use of set definition
 """
