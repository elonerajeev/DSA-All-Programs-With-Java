'''
# LINEAR SEARCH
list1 = [10, 20, 30, 40, 50, 60, 70, 80, 100]
lengthOfList = len(list1)
print("Your list is:", list1)
x = int(input("Enter the element to search: "))
Test = False  

for i in range(lengthOfList):
    if list1[i] == x:
        Test = True
        break

if Test:
    print(f"Yes, the {x} is found in the list.")
else:
    print(f"No, the {x} is not found in the list.")
'''

#BUBBLE SEARCH
list1 = [10, 20, 130, 40, 450, 60, 70, 8, 100]
lengthOfList = len(list1)

print("Original list:", list1)

# Bubble Sort using Temp Variable
for i in range(lengthOfList - 1):
    for j in range(lengthOfList - i - 1):
        if list1[j] > list1[j + 1]:
            temp = list1[j]
            list1[j] = list1[j + 1]
            list1[j + 1] = temp

print("Sorted list:", list1)

x = int(input("Enter the element to search: "))
found = False

# Linear Search in Sorted List
for i in range(lengthOfList):
    if list1[i] == x:
        found = True
        break

if found:
    print(f"Yes, the {x} is found in the sorted list.")
else:
    print(f"No, the {x} is not found in the sorted list.")
