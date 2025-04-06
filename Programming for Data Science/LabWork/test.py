def cprime(n):
  if n <= 1:
    return False
  if n == 3:
    return True
  if n%2==0 or n%3==0 or n%5==0 or n%7==0:
    return False
  i = 5
  while i <n:
    if n % i == 0 :
      return False
    i = i+1
  return True

def carm(n):
  order = len(str(n))
  sum = 0
  temp = n
  while temp > 0:
    digit = temp % 10
    sum += digit ** order
    
    temp = temp // 10
  return sum == n

n = int(input("Enter number "))
if cprime(n):
  print(n, "is a prime no.")
else:
  print(n, "is not a prime no.")

if carm(n):
  print(n, "is an armstrong no.")
else:
  print(n, "is not armstrong no.")
  
  