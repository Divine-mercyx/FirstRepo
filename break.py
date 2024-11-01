number = input("enter a number: ")
remaining = 0
sum = 0
if number.isdigit():
    number = int(number)
    while number > 0:
        remaining = number % 10
        sum = sum + remaining
        number = number // 10
    
    else: 
        print(sum)
else:
    print(f"'{number}' not an integer")