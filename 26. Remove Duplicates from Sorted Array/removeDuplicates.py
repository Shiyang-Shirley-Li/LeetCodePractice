"""
Tag: Array
Difficulty: Easy
Approach: Two Pointers
Analysis:
  1. The array is sorted, we can keep two pointers i and j, where i is the slow-runner while j is the fast-runner
"""

class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        for i in range(len(nums)-1, 0, -1):
            if nums[i] == nums[i-1]:
                nums.remove(nums[i-1])
        
        return len(nums)
      
      
"""
Conclude errors: 
1. syntax & semantics: range(start_index, end_index) --- end_index not included
2. corner case: only one item in nums
"""
