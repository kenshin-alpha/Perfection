class BubbleSort{
    static void bubbleSort(int[] array) {
        int size = array.length;

        for (int i = 0; i<size;i++) {
            for (int j = 0; j < size - i - 1 ; j++) {
                if (array[j+1] < array[j]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {
        int[] data = {2,3,4,1,3,67,-3,12,-45};
        BubbleSort.bubbleSort(data);
        for( int i : data){
            System.out.println(i);
        }
    }
}