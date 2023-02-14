

public class BinarySearch {

    static int binarySearch(int[] arr, int low, int high, int key) {
        int mid = (low+high)/2;
        while(low <= high) {
            if(arr[mid] < key) {
                low = mid + 1;
            }
            else if(arr[mid] == key) {
                return mid;
            }
            else {
                high = mid - 1;
            }

            mid = (low + high) / 2;
        }
        if (low > high) {
            return -1;
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] arr = {2,3,4,5,1,9,7,8};
        int search = binarySearch(arr, 0, arr.length-1, 5);
        System.out.println(search);
    }
}
