# can be used to call values using names
# works like a dict


from collections import namedtuple

Student = namedtuple('Stud',["name","age","DOB"])

s = Student("Harish",23,13243112)


print(s.name)
