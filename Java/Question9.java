import java.util.Scanner;

public class Question9 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int p = sc.nextInt();
       int q = sc.nextInt();
       for(int i = p;i<=q; i++) {
           int sq = i * i;

            String input = Integer.toString(i);
           String str = "" + sq;
           System.out.println(input);
           String str1 = str.substring(str.length() - input.length() , str.length());
           String str2 = str.substring(0, str.length() - input.length());
           int result = Integer.parseInt(str1) + Integer.parseInt(str2);
           if(result == i) {
               System.out.println(i);
           }
           
       }

            int  i = 45;
           int sq = i * i;
           String iq = "" + i;
           String input = "" + sq;
           
        
            int quotient = 1;
            for(int j = 0;j <iq.length(); j++) quotient = quotient * 10;
            int remainder = sq % (quotient);
           sq = sq / (quotient);
           System.out.println(sq+ " " + input.length());
           int result = sq + remainder;
           if(result == i) {
               System.out.println(i);
           }
       
   } 
}
