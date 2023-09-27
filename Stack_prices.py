
# DAILY STACK PRICES ##
list1 = [17,6,5,4,10,1]
length = len(list1)
#for i in range (length):
minimum = min(list1)
indexMin = list1.index(minimum)
print(f"Day of buy the stack : {indexMin} and price is : ${minimum} ")
if indexMin < indexMax:
     maximum = max(list1)
     indexMax = list1.index(maximum)
     print(f"Day of Sell the stack : {indexMax} and price is : ${maximum} ")
else:
     print(f"Profit is back day but cant go")
profit = maximum - minimum
print("Your profit is : " , profit)


###################################
'''
list1 = [70,6,5,4,10,1]
n = len(list1)
for i in range(n):
    for j in range(0, n-i-1):
        if list1[j] > list1[j+1]:
            list1[j], list1[j+1] = list1[j+1], list1[j]
            
minimum = list1[0]
indexMin = list1.index(minimum)
print(f"Day of buy the stack : {indexMin} and price is : ${minimum} ")

maximum = list1[n - 1]
indexMax = list1.index(maximum)
print(f"Day of Sell the stack : {indexMax} and price is : ${maximum} ")

profit = maximum - minimum
print("Your profit is : " , profit)
'''






