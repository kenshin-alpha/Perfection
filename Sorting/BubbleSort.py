def bubbleSort(array):
    for i in range(len(array)):
        for j in range(0, len(array) - i - 1):
            if(array[j] > array[j+1]):
                array[j] , array[j+1] = array[j+1], array[j]


data = [21,34,5,98,-32,-33]

bubbleSort(data)

print(data)

