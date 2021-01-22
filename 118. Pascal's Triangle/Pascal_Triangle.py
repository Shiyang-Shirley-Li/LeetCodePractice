"""
Tag: Array
Difficulty: Easy
"""

class Solution:
    def generate(self, numRows: int) -> List[List[int]]:
        list_of_lists = [0]*numRows
        for i in range(0, numRows):
            list = [0]*(i+1)
            for j in range(0, i+1):
                if j == 0 or j == i:
                    list[j] = 1 
                else:
                    list[j] = list_of_lists[i-1][j-1]+list_of_lists[i-1][j]
            list_of_lists[i] = list
        
        return list_of_lists
 
"""
Conclusion: 
1. syntax & semantics: initialize list; append method in list is to add items to the end of a list
"""
