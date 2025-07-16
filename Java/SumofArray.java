import java.util.ArrayList;

public class SumofArray {
   public static void main(String[] args) {
    ArrayList<Integer> ab = new ArrayList<>();
    ab.add(2);
    ab.add(4);
    ab.add(43);
    ab.add(52);
    ab.add(8);
    int sum = 0;
    for(int i : ab) {
        sum = sum + i;
    }
    System.out.println(sum);
   } 
}
