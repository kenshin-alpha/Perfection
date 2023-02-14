def SelectionSort(array):

    size = len(array)

    for i in range(size):
        min_idx = i

        for j in range(i,size):
            if(array[j] < array[min_idx]):
                min_idx = j

        array[min_idx],array[i] = array[i],array[min_idx]

data = [3,1,9,-2]

SelectionSort(data)

print(data)