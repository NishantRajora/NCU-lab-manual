class Person:
    def __init__(self, name, age, address, gender, salary):
        self.name = name
        self.age = age
        self.address = address
        self.__gender = gender  
        self.salary = salary

    def display(self):
        print("Name: ", self.name)
        print("Age: ", self.age)
        print("Address: ", self.address)
        print("Gender: ", self.__gender)
        print("Salary: ", self.salary)
        print("")

    def name(self):
        return self.name
    def age(self):
        return self.age
    def address(self):
        return self.address
    def gender(self):
        return self.__gender
    def salary(self):
        return self.salary
    
    def sname(self, value):
        self.name = value
    def sage(self, value):
        self.age = value
    def saddress(self, value):
        self.address = value
    def sgender(self,value):
        self.__gender = value
    def sgender(self, value):
        self.__gender = value
    def ssalary(self, value):
        self.salary = value


p1 = Person("Nishant", 20, "Gurgaon", "Male", 60000)
p2 = Person("Nipun", 21, "Delhi", "Male", 55000)

p1.display()
p2.display()

p1.name = "N"
p1.gender = "M"
p1.age= 29
p1.address ="Delhi"
p1.display()

p2.sname("Nish")
p2.sgender("m")
p2.display()
