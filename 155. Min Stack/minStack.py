"""
Tag: Stack
Difficulty: Easy
"""

class MinStack:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.stack = []

    def push(self, x: int) -> None:
        self.stack.append(x)

    def pop(self) -> None:
        popItem = self.stack.pop()

    def top(self) -> int:
        popItem = self.stack.pop()
        self.stack.append(popItem)
        return popItem

    def getMin(self) -> int:
        sort_stack = sorted(self.stack)
        return sort_stack[0]


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(x)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()

"""
Conclusion:
  1. To initialize data structure: self.stack
  2. sorted(list) will not sort in place, but list.sort() will. 
"""
