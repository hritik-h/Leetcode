class MyQueue:

    def __init__(self):
        self.stack1 = []
        self.stack2 = []

    def push(self, x: int) -> None:
        self.stack2.append(x)

    def pop(self) -> int:
        if self.stack1: 
            return self.stack1.pop()
        while self.stack2:   self.stack1.append(self.stack2.pop())

        return self.stack1.pop()

    def peek(self) -> int:
        if self.stack1: return self.stack1[len(self.stack1)-1]
        else: return self.stack2[0]

    def empty(self) -> bool:
        if not self.stack1 and not self.stack2: return True
        return False


# Your MyQueue object will be instantiated and called as such:
# obj = MyQueue()
# obj.push(x)
# param_2 = obj.pop()
# param_3 = obj.peek()
# param_4 = obj.empty()