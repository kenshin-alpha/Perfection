def fibonacci(n):
    a = 0
    b = 1

    while (n > 0):
        c = a + b
        print(c, end=" ")
        a = b
        b = c
        n-=1

    
fibonacci(10)
