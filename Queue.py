class Queue:
     def __init__(self):
          self.list1 = []

     def size(self):
          return len(self.list1)

     def is_empty(self):
          return self.size() == 0

     def enqueue(self,element):
          self.list1.append(element)

     def dequeue(self):
          if self.is_empty():
               return "Queue is empty"
          else:
               return self.list1.pop(0)

#________________________________________________________________

my_queue = Queue()
my_queue.enqueue(10)
my_queue.enqueue(20)
my_queue.enqueue(30)
my_queue.enqueue(40)
my_queue.enqueue(50)
my_queue.enqueue(60)
print("Before Dequeue :",my_queue.list1)

my_queue.dequeue()
my_queue.dequeue()
my_queue.dequeue()
print("After Dequeue :",my_queue.list1)







