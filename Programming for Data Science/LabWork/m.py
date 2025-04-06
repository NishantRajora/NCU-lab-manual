
m={}
n= int(input("enter the no of input"))
for i in range(n):
    k=input("Enter key")
    v=input("value")
    m[k]=v
print(m)

car= {"brand": "Toyota","year": 2015,"model": "Corolla"}
print(car)

model = car["model"]
print(model)

car["year"] = 2021
print(car)

del car["year"]
print(car)

car["condition"] = "good"
print(car)

length = len(car)
print(length)

c = car.copy()
print(c) 

