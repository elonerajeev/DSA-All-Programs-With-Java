class Stack:
    def __init__(self):
        self.stack = []

    def push(self, item):
        self.stack.append(item)

    def pop(self):
        if not self.is_empty():
            return self.stack.pop()

    def peek(self):
        if not self.is_empty():
            return self.stack[-1]

    def is_empty(self):
        return len(self.stack) == 0

    def traverse(self):
        for item in reversed(self.stack):
            print(item)


# Example usage
stack = Stack()

stack.push(10)
stack.push(20)
stack.push(30)

print("Traversing elements in the stack:")
stack.traverse()
