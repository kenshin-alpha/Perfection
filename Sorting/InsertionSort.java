import java.util.Arrays;
class InsertionSort {
    static void insertionSort(int[] array) {
        int size = array.length;
        for (int i = 1;i<size;i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && key < array[j]) {
                array[j+1] = array[j];
                j = j - 1;
            } 

            array[j+1] = key; 

        }
    }

    public static void main(String[] args) {
        int[] data = {33,12,-32,42,30};
        insertionSort(data);
        System.out.println(Arrays.toString(data));
    }
}