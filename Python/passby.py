# pass by value = immutable objects. where they create a copy of data 
# and pass it to function
# Immutable objects : Number(int,float,bool,etc), Strings, Tuples, Frozen Sets

# All operations using immutable objects make copies

def myFunc(a):
    print("Value received in 'a' =",a)
    a += 2
    print("Value of 'a' changes to :",a)

print("Call by value")
print()
num = 13
print("Inital number: ",num)
myFunc(num)
print("Value fo number ", num)



# When mutable Objects such as list, dict, set, etc., are passed as arguments
# to the function call, it can be called as call by reference.
# When the values are modified within the function, the change also gets 
# reflected outside the function.

def myFunc2(myList):
    print("List received: ",myList)
    myList.append(3)
    myList.extend([7,1])
    print("List after adding some element:", myList)
    myList.remove(7)
    print("List within called function:", myList)
    return

print("Call by reference")
print()
List1 = [1]
print("List before function call : ",List1)
myFunc2(List1)
print("List after function call: ",List1)


# Consider this example:

def myFunc3(myList):
    print("List received: ",myList)
    myList.append(3)
    myList.extend([7,1])
    print("List after adding some element:", myList)
    myList.remove(7)
    myList = myList + [3,4,6]
    print("List within called function:", myList)
    return

print("Call by reference && equal operator")
print()
List1 = [1]
print("List before function call : ",List1)
myFunc3(List1)
print("List after function call: ",List1)

## When we assign a something to a object it copies the data into new memory location.

