class Person:
    
    
    def __init__(self,n ,o):
        self.name = n
        self.occ= o  
        self.networth = 1000
        print("i am a persom")
    
    def info(self):
        print(f"{self.name} is a {self.occ} ")
  
a= Person("nishnt","eng")
b= Person("nish", "acc")
a.info()

b.info()

