# A class method is a method that is bound to the class and not the object of the class.
# They have the access to the state of the class as it takes a class parameter that points 
# to the class and not the object instance.
# It can modify a class state that would apply across all the instances of 
# the class. For example, it can modify a class variable that will be 
# applicable to all the instances.

# The difference between the Class method and the static method is:

# A class method takes cls as the first parameter while a static method needs no specific parameters.
# A class method can access or modify the class state while a static method can’t access or modify it.


from datetime import date

class Person:
    
    def __init__(self,name,age):
        self.name = name 
        self.age = age

    @classmethod
    def fromBirthYear(cls,name,year):
        return cls(name,date.today().year-year)
    
    @staticmethod
    def isAdult(age):
        return age > 18
    
person1 = Person('Mayank',18)
person2 = Person.fromBirthYear('Kenshin',1999)

print(person1.age)
print(person2.age)

print(Person.isAdult(20))
    
