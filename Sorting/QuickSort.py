def partition(array,low,high):
    pivot = array[high]
    i = low - 1
    for j in range(0,high):
        if(array[j] <= pivot):
            i = i + 1
            array[i] , array[j] = array[j], array[i]
    array[i+1],array[high] = array[high], array[i+1]
    return i + 1
    

def quickSort(array,low,high):
    if low < high:
        pi = partition(array,low,high)
        quickSort(array,low,pi - 1)
        quickSort(array,pi+1,high)

data = [32,12,56,2,23,55]

quickSort(data,0,len(data) - 1)

print(data)

        
    
