from abc import ABC, abstractmethod

class Animal(ABC):
    def __init__(self, name, age):
        self.name = name
        self.age = age
    def eat(self):
        print(f"{self.name} is eating.")
    def sleep(self):
        print(f"{self.name} is sleeping.")
    @abstractmethod
    def make_sound(self):
        pass 

class Dog(Animal):
    def bark(self):
        print(f"{self.name} is barking.")
    def make_sound(self):
        self.bark()  

class Cat(Animal):
    def meow(self):
        print(f"{self.name} is meowing.")
    def make_sound(self):
        self.meow() 
if __name__ == "__main__":

    dog = Dog("Buddy", 3)
    cat = Cat("Whiskers", 2)

    animal_list = [dog, cat] 

    for animal in animal_list:
        animal.eat()
        animal.make_sound() 