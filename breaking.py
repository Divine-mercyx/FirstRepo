number = input("enter a number: ")
sum = 0

for count in number:
    if count.isdigit():
        if int(count) >= 5:
            sum = sum + 1
        else:
            sum = sum + 0
    else:
        print(f"'{count}' not an integer")


print(sum)