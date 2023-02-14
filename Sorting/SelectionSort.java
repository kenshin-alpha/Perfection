import java.util.Arrays;

class SelectionSort{
    static void selectionSort(int[] array) {
        int size = array.length;

        for (int i = 0;i<size;i++) {
            int min_idx = i;
            
            for( int j = i+1 ; j <size; j++) {
                if(array[j] < array[min_idx]) {
                    min_idx = j;

                }
            }

            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {12,34,1,-42,-35};
        SelectionSort.selectionSort(data);
        for( int i : data) {
            System.out.println(i);
        }

        System.out.println(Arrays.toString(data));
    }
}