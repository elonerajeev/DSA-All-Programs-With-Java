'''
my_list = [64, 34, 25, 12, 22, 11, 90]
print("Original list:", my_list)
n = len(my_list)
for i in range(n):
    swapped = False
    for j in range(0, n-i-1):
        if my_list[j] > my_list[j+1]:
            my_list[j], my_list[j+1] = my_list[j+1], my_list[j]
            swapped = True
    if not swapped:
        break
print("Sorted list:", my_list)
'''

arr = [64, 25, 12, 22, 11]

n = len(arr)

for i in range(n):
    for j in range(0, n-i-1):
        if arr[j] > arr[j+1]:
            # Swap the elements
            arr[j], arr[j+1] = arr[j+1], arr[j]

print("Sorted array:", arr)


















