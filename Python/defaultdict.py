# Helps to eliminate key error exception

from collections import defaultdict

def mapping():
    return "not present"

d = defaultdict(mapping)

d[1] = 4
d[2] = 5
 
print(d[1])
print(d[2])
print(d[3])

print(d)