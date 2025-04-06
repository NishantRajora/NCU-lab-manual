#side effec
x = 10
def modi():
    global x
    x += 5  
modi()
print(x) 
#default
def info(name= "Nishant", age = 19):
    print("Name: ",name," Age:" ,age)
info() 
info("nis",21)
info(age= 22,name ="kav")



def factorial(n):
    if n == 1:
        return 1
    else:
        return n * factorial(n-1)

print(factorial(5)) 

