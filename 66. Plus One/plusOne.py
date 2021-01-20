"""
Tag: Array
Difficulty: Easy
"""

class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        digit_str = ''
        for digit in digits:
            digit_str += str(digit)
        
        digit_int = int(digit_str)
        digit_int += 1
        
        digit_str = str(digit_int)
        
        plus_one_digits = list(digit_str)
        while len(plus_one_digits) < len(digits):
            plus_one_digits.insert(0, 0) 
        
        return plus_one_digits

"""
Conclusion:
1. syntax & semantics: string cast:str() 
2. corner case: Did not understand "You may assume the integer does not contain any leading zero, except the number 0 itself." at the beginning
                It means we can have case like digits = [0, 0]
"""
