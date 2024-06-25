def fractionalKnapsack(w,v,W):
    ratio = []
    weight = 0
    value = 0
    for i in range(len(w)):
        ratio.append(v[i]/w[i])
    while(weight < W):
        maxr = max(ratio)
        index = ratio.index(maxr)
        if(weight + w[index] <= W):
            value = value + v[index]
            weight = weight + w[index]
        else:
            rem = W - weight
            value = value + v[index]* (rem/w[index])
            weight = weight + w[index]*(rem/w[index])
        w.pop(index)
        v.pop(index)
    return value



w = [18,15,10]
v = [25,24,15]
W = 20
print(fractionalKnapsack(w,v,W))