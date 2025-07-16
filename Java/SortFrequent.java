import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.LinkedHashMap;

public class SortFrequent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i<num ;i++) {
            arr[i] = sc.nextInt();
        }
        
        Map<Integer,Integer> map = new LinkedHashMap<>();
        for(int i : arr){
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i,1);
            }
        }
        ArrayList<Integer> ar = new ArrayList<>();
        map.entrySet()
        .stream()
        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
        .forEach((n) -> {
            
            ar.add(n.getKey());
        });

        System.out.println(ar);
        System.out.println(map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())));

    }    
}
