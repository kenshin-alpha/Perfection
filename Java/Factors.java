import java.util.ArrayList;
import java.util.Comparator;

public class Factors {
    public static void main(String[] args) {
        ArrayList arr = new ArrayList();
        int num = 625;
        int quotient;
        int sqr = (int) Math.sqrt(num);
        for (int i = 1; i <= sqr; i++) {
            if(num % i == 0) {
                arr.add(i);
                quotient = num/i;
                if(!arr.contains(quotient))
                    arr.add(quotient);
                

            }
        }
        arr.sort(Comparator.naturalOrder());
        //arr.replaceAll(e -> e+5);
        System.out.println(arr.toString());
        arr.add(15);
        String b = "hello";
        char[] ab = b.toCharArray();
        for(char a:ab)
        arr.add(a);
        System.out.println(arr.toString());
        System.out.println((int)'j');
        
    }

}
