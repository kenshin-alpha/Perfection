def my_decorator(func):
    def wrapper(*args,**kwargs):
        print("before call")
        result = func(*args,**kwargs)
        print(result)
        print("after call")
        return result
    
    return wrapper

@my_decorator
def add(a,b):
    return a+b

add(2,5)
