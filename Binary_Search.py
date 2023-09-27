## BINARY SEARCHING ##
'''
list1 = [10,20,30,40,50,60,70,80,90,100,200]
x = int(input("Enter the searching : "))
length = len(list1)
lowIndex = 0
highIndex = length - 1
middle = (lowIndex + highIndex)//2
Test = False
i = 0
while(middle == 0):
     if (list1[i] == x):
          Test = True
     i = -1
if Test :
     print("Yes")
else:
     print("No")
     
'''
def binary_search(list1, x):
    low = 0
    high = len(list1) - 1

    while low <= high:
        mid = (low + high) // 2

        if list1[mid] == x:
            return mid
        elif list1[mid] < x:
            low = mid + 1
        else:
            high = mid - 1

    return -1


list1 = [10, 12, 5, 3, 4]
x = 3

result = binary_search(list1, x)

if result != -1:
    print("The element is found at index", result)
else:
    print("The element is not found")



















          
