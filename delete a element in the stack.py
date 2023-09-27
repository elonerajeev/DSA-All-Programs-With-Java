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

# Example usage
my_stack = Stack()

my_stack.push(10)
my_stack.push(20)
my_stack.push(30)

popped_item = my_stack.pop()
if popped_item is not None:
    print("Popped item:", popped_item)
else:
    print("Stack is empty. Cannot pop.")

top_element = my_stack.peek()
if top_element is not None:
    print("Top element:", top_element)
else:
    print("Stack is empty. No top element.")






    
