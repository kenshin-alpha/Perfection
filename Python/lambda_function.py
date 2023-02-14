# lambda argument(s) : expression 

greet = lambda : print("hello World")

greet()

reply = lambda name : print("Hey there!", name)

reply("Harish")

square = lambda num : [print(i*i) for i in range(num)] 

square(5)

x = [1,2,3,4,5]

even_or_odd = lambda li : [print("True")  for i in li if i%2==0]

even_or_odd(x)

print("==========================")

even_or_odd = lambda li : [print("True") if i%2==0 else print("False") for i in li]

even_or_odd(x)

print("==========================")

def evenodd(num):
    if num%2== 0:
        return True
    else:
        return False

even_or_odd = lambda fun,li : [print(fun(i)) for i in li]

even_or_odd(evenodd,x)

print("==========================")

even_or_odd = lambda fun,li : [print(fun(i)) for i in x]

even_or_odd(evenodd,x)




