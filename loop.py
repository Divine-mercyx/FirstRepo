number = int(input("enter a number: "))

count = 1
largest = number

while count < 10:
    number = int(input("enter a number: "))
    if number < 200:
        if number > largest:
           largest = number    
    else:
        break
    count += 1

print(largest)