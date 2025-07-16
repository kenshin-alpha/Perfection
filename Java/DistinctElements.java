import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class DistinctElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i<num ;i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i,1);
            }
        }
        Set<Integer> tr = map.keySet();
        
        
        for(int i : tr) {
            System.out.println(i + " occurs " + map.get(i) + " times.");
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }    
}
