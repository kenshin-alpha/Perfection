import java.util.ArrayList;

public class Power {
   public static void main(String[] args) {
       int num = 5;
       int power = 3;
       int temp = num;
       while(power > 1){
           
            num = num * temp;
           System.out.println(power);
           power--;

       }
       System.out.println(num);
       ArrayList<Integer> ab = new ArrayList<Integer>();
        ab.add(2);
        ab.add(3);
        ab.add(4);
        ab.add(5);
        ab.replaceAll(n -> (n*n));       
       System.out.println(ab.toString());
    }
}
