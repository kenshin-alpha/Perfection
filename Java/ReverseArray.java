import java.util.ArrayList;
import java.util.Iterator;

public class ReverseArray {
   public static void main(String[] args) {
    ArrayList<Integer> ab = new ArrayList<>();
    ab.add(2);
    ab.add(4);
    ab.add(43);
    ab.add(52);
    ab.add(8);
    for (int i = ab.size()-1; i>=0 ;i--){
        System.out.println(ab.get(i));
    }
   } 
}
