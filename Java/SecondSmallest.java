import java.util.ArrayList;

public class SecondSmallest {
    
    
    public static void main(String[] args) {
       ArrayList<Integer> ab = new ArrayList<>();
       ab.add(2);
       ab.add(4);
       ab.add(43);
       ab.add(52);
       ab.add(8);
        int min = Integer.MAX_VALUE;
      
       for(int i:ab) {
           if(min > i) min = i;
       }
       ab.remove(ab.indexOf(min));
       min = Integer.MAX_VALUE;
       System.out.println(ab.toString());
       for(int i:ab) {
           if(min > i) min = i;
       }
       System.out.println(min);
   } 
}
