import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i = 0;i<num; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int sum = 0;
        for(int i: arr) {
            sum = sum + i;
            if(sum%2 == 1) {
                count = count + 2;
            }
        }
        if(sum%2 != 0) {
            System.out.println("NO");
        } else {
            System.out.println(count);
        }
    }
}
