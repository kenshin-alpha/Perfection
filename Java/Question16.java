import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Question16 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int num = sc.nextInt();
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i<=str.length();i++) {
            for (int j = i+1;j<=str.length();j++) {
                arr.add(str.substring(i, j));
            }
        }
        HashSet<Integer> set = new HashSet<>();
        for(String s: arr) {
            int sum = 0;
            char[] ch = s.toCharArray();
            for(char a : ch) {
                sum = sum + (int)a - 'a' + 1 ;
            }
            set.add(sum);
        }
        System.out.println(set.toString());
        if(set.contains(num)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
   } 
}
