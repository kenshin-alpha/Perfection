di2 = [
     {
    "name" : "kenshin",
    "sal" : 3000
    },
    
    {
    "name" : "kenta",
    "sal" : 200
    }
]

si2 = sorted(di2, key=lambda x : x["sal"])
print(si2)

di2.sort(key= lambda x : x["sal"])
print(di2)
