import java.util.ArrayList;

public class AscendingDescending {
   public static void main(String[] args) {
    ArrayList<Integer> ab = new ArrayList<>();
    ab.add(2);
    ab.add(4);
    ab.add(43);
    ab.add(10);
    ab.add(8);
    ab.add(32);
    ab.add(23);
    int temp;
    System.out.println(ab.toString());
    for(int i = 0; i<=ab.size()/2;i++) {
        for(int j = i+1; j<=ab.size()/2;j++) {
            if(ab.get(i)>ab.get(j)) {
                temp = ab.get(i);
                ab.set(i, ab.get(j));
                ab.set(j, temp);
            }
        }
    }
    for(int i = ab.size()-1; i>ab.size()/2;i--) {
        for(int j = i-1; j>ab.size()/2;j--) {
            if(ab.get(i)>ab.get(j)) {
                temp = ab.get(i);
                ab.set(i, ab.get(j));
                ab.set(j, temp);
            }
        }
    } 
    System.out.println(ab.toString());
    }
}
