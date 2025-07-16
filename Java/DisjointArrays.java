import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;
import java.util.Arrays;

class DisjointArrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Integer arr1[] = new Integer[num1];
        Integer arr2[] = new Integer[num2];
        for(int i = 0; i<num1; i++)
        arr1[i] = sc.nextInt();
        for(int i= 0; i<num2;i++)
        arr2[i] = sc.nextInt();
        List<Integer> l1 = Arrays.asList(arr1);
        List<Integer> l2 = Arrays.asList(arr2);
        boolean flag = false;
        Arrays.stream(arr1).distinct().forEach(n -> System.out.println(n));
        
        for(Integer i: l1) {
            if(l2.contains(i)) {
                flag = true;
                break;
            }

        }
        if(flag) {
            System.out.println("Arrays are not disjoint");
        } else {
            System.out.println("Arrays are disjoint");
        }
        if(l1.containsAll(l2)) {
            System.out.println("Arrays are subsets");
        } else {
            System.out.println("Arrays are not subsets");
        }
        
    }
}