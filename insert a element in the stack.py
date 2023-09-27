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


# Create a stack instance
my_stack = Stack()

# Push elements onto the stack
my_stack.push(10)
my_stack.push(20)
my_stack.push(30)

# Insert an element into the stack
element_to_insert = 25
my_stack.push(element_to_insert)

#input taking by the user
taking_user=eval(input("Enter the inserting element : "))
my_stack.push(taking_user)

# Print the stack after insertion
print("Stack elements after insertion:")
while not my_stack.is_empty():
    print(my_stack.pop())




    
