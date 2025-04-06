f = ['apple', 'banana', 'noodles']


for x in f:
    print(x)

f.append('orange')
print(f)


f.remove('banana')
print(f)

f.append('banana')
print(f)
f.pop()
print(f)
print( len(f))
j=input("enter fruit ofr search ")
for x in f:
    if x==j:
        print(j,"is ther in the list")
    print("x")
if (x in f):
    print
n=f.copy()
print(n)
print(f)
f.insert(1, 'apple')
print(f)
f.sort()  
print(f)
f.reverse()
print(f)

c =f.count('apple') 
print(c) 
