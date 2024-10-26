largest = 0
count = 1

while count <= 10:
    score = int(input("enter a score: "))
    if score > 0 and score < 100:
        if score > largest:
            largest = score
    else:
        print("invalid input")
        count -= 1
    count += 1


print(f"the largest number is {largest}")