import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Question6 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int testcases = sc.nextInt();
       for(int i = 0; i < testcases; i++) {
           
               int b = sc.nextInt();
               int w = sc.nextInt();
               int bc = sc.nextInt();
               int wc = sc.nextInt();
               int z = sc.nextInt();
               int cost = 0;
               if(bc*b==wc*w) {
                   cost = cost + bc*b + wc*w;
               } 
               else if(bc*b<wc*w) {
                    cost = cost + (bc*b);
                    if(wc*w<w*bc + w*z) {
                        cost = cost + wc * w;
                    } else {
                        cost = cost + w*bc + w*z;
                    }
               }
               else if(bc * b > wc*w) {
                   cost = cost + (wc*w);
                   if(bc*b < b*wc + b*z) {
                       cost = cost + bc *b;
                   } else {
                       cost = cost + b*wc + b*z; 
                   }
               }
           System.out.println(cost);
       }
   } 
}
