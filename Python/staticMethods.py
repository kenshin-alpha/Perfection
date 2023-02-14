# the difference being that a static method is bound to a class 
# rather than the objects for that class. This means that a static method 
# can be called without an object for that class. This also means that 
# static methods cannot modify the state of an object as they are not 
# bound to it. Let’s see how we can create static methods in Python. 


class Calculator:

    #add numbers using static method
    @staticmethod
    def add(x,y):
        return x+y
    
    def subtract(x,y):
        return x-y
    
calci = Calculator()
print(calci.add(3,4))
print("Sum of 3 and 5 is :", Calculator.subtract(8,5))


