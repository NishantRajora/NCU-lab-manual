import time
# Factorial - Iterative
def factorial_iter(n):
    result = 1
    for i in range(1, n + 1):
        result *= i
    return result

# Factorial - Recursive
def factorial_rec(n):
    if n <= 1:
        return 1
    return n * factorial_rec(n - 1)

# Fibonacci - Recursive
def fibonacci_rec(n):
    if n <= 1:
        return n
    return fibonacci_rec(n - 1) + fibonacci_rec(n - 2)

n = 5

start = time.time()
print("Factorial (Iterative) of", n, "is", factorial_iter(n))
print("Time taken (Iterative):", time.time() - start, "seconds")

start = time.time()
print("Factorial (Recursive) of", n, "is", factorial_rec(n))
print("Time taken (Recursive):", time.time() - start, "seconds")

start = time.time()
print("Fibonacci (Recursive) of", n, "is", fibonacci_rec(n))
print("Time taken (Recursive):", time.time() - start, "seconds")
