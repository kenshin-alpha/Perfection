import java.util.Scanner;

public class HCF {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num1 = sc.nextInt();
       int num2 = sc.nextInt();
       int min;
       if(num1<=num2) min = num1;
       else min = num2;
       int hcf = 0;
       for(int i = 1;i<=min;i++) {
            if(num1%i == 0 && num2 %i == 0) hcf = i;
       }
      System.out.println(hcf);
      System.out.println(16%24);
    
    }
}
