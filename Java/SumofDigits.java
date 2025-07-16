import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int num = sc.nextInt();
        int remainder;
        int sum = 0;
        String reverse = "";
        while(num > 0) {
            remainder = num % 10;
            sum = sum + remainder;
            num = num / 10;
            reverse = reverse + remainder;
        }
        System.out.println(sum);
        System.out.println(reverse);
    }
}
