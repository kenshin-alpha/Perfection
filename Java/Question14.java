import java.util.Scanner;

class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0;i<num ; i++) {
            arr[i] = sc.nextInt();
        }
        int subarray = 0;
        int maxsubarray;
        for(int i = 0;i<num;i++) {
            if(arr[i]>0) {
                subarray = subarray + arr[i];
            }
        }
    }
}