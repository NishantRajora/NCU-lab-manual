n = int(input("enter number of numbers "))

for i in range(n):
    k = int(input("enter a number "))
    
    if k >= 0:
        print(k, "is positive")
    else:
        print(k, "is negative")

    if k % 2 == 0:
        print(k, "is even")
    else:
        print(k,"is odd")
        
        