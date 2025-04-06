
numbers = list(map(int, input("Enter a list of numbers separated by space: ").split()))

smallest = min(numbers)

indexs = numbers.index(smallest)

print(f"The index of the smallest element ({smallest}) is {indexs}")
