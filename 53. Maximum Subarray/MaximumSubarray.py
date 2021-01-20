"""
Tag: Array
Difficulty: Easy
Approach: DP
Analysis: This is an optimization problem, which can be usually solved by DP. 
          1. Find sub problem
          2. Find the limitation
"""

class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        nums_length = len(nums)
        dp = [0] * nums_length
        dp[0] = nums[0] #dp[i] is the sum of continuous items till nums[i]
        max_sum = nums[0]
        
        for i in range(1, nums_length):
            if dp[i-1] > 0:
                dp[i] = dp[i-1] + nums[i]
            else:
                dp[i] = nums[i] + 0
                
            max_sum = max(dp[i], max_sum) 

        return max_sum



"""
Conclude errors: 
1. syntax & semantics: there is no max or min integer limit in python 3; the way of initialize a list; 
2. corner case:
"""
