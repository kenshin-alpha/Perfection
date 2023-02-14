def MergeSort(array):

    if(len(array) > 1):

        r = len(array)//2
        L = array[:r]
        M = array[r:]

        MergeSort(L)
        MergeSort(M)


        i = j = k = 0

        while i < len(L) and j < len(M):

            if(L[i] < M[j]):
                array[k] = L[i]
                i += 1
            else:
                array[k] = M[j]
                j += 1
            k += 1
            
        while i < len(L):
            array[k] = L[i]
            i += 1
            k += 1

        while j < len(M):
            array[k] = M[j]
            j += 1
            k += 1


data = [6, 5, 12, 10, 9, 1]

MergeSort(data)


print(data)
            