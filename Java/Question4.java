import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int remainder;
        int count = 0;
        while(temp > 0) {
            remainder = temp % 10;
            if(num % remainder == 0) {
                count++;
            }
            temp = temp/10;
        }
        System.out.println(count);
        sc.close();
    }
}
