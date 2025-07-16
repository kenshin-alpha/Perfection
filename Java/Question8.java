import java.util.Scanner;

public class Question8 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int p = sc.nextInt();
       int d = sc.nextInt();
       int m = sc.nextInt();
       int s = sc.nextInt();
        int count = 0;
       while(s>0) {
           if(p>m) {
               s = s - p;
               p= p -d;
               count++;
           } else {
            s = s - m;
            count++;
           }
       }
       System.out.println(count - 1);
       sc.close();
   } 
}
