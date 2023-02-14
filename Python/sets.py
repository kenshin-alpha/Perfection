E = {0,2,4,6,7,8,9}
D = {2,3,5,6,7,9}
# These are meant to perform operations and return a new set 
# without changing the actual value of the set
print(E.union(D),E | D)
print(E.intersection(D), E & D)
print(E.difference(D),E - D)
print(E.symmetric_difference(D),E ^ D)



# These are meant to apply changes to the set permanently 
print(E.update(D))   # is used to make union changes permanent
# intersection_update()
# difference_update()
# symmetric_difference_update()
#These are meant to apply changes to the set internally 
print(E)


Methods = [ 'add', 'clear', 'copy', 'difference',
 
 'difference_update', 'discard', 'intersection', 'intersection_update',
 
 'isdisjoint', 'issubset', 'issuperset', 'pop', 'remove',
  
 'symmetric_difference', 'symmetric_difference_update', 'union', 'update',
 
 '__and__', '__class__', '__class_getitem__', '__contains__', '__delattr__',
 
 '__dir__', '__doc__', '__eq__', '__format__', '__ge__', '__getattribute__',
 
 '__gt__', '__hash__', '__iand__', '__init__', '__init_subclass__', '__ior__',
 
 '__isub__', '__iter__', '__ixor__', '__le__', '__len__', '__lt__', '__ne__',
 
 '__new__', '__or__', '__rand__', '__reduce__', '__reduce_ex__', '__repr__',
 
 '__ror__', '__rsub__', '__rxor__', '__setattr__', '__sizeof__', '__str__',
 
 '__sub__', '__subclasshook__', '__xor__']