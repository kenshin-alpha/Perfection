def sumOfNaturalNumbers(n):
    if n == 1: return 1
    return n+sumOfNaturalNumbers(n-1)


print(sumOfNaturalNumbers(5))
