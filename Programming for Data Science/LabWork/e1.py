a = 10
x = int(input("Enter your age: "))
# This is a comment
print(23-4*3+36)
print(6/3*2)
b = 12.7
c = 2
print(b+c)
print(type(b+c))
comp = 5+6j
s = complex(input("Enter a complex num to multiply with: "))
print(comp," added to ",s,"is: ",comp+s)
precedent = True
choice = bool(input("Enter your choice(True/False): "))
if (choice == precedent):
   print("Your choice matches societal precedent.")
else:
   print("Your choice doesn't match societal precedent.")
a = 10
b = 3
c = 2
result1 = a / b // c  # (10 / 3) // 2 = 3.3333 // 2 = 1.0
print(f"Result of a / b // c:", result1)
a = 5
b = 10
c = 3
d = 2
e = True
f = False
result11 = not e or f and e
result5 = a * b / c // d % 3
print(result11,result5)