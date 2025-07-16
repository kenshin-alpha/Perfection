import java.util.Arrays;
import java.util.Scanner;

public class ExtraQuestion1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt()+1;
        // int[] arr = new int[num];
        // int k = 22;
        // arr[0] = 6;
        // for(int i = 1; i<num;i++) {
        //     arr[i] = arr[i-1] + k;
        //     k = k + 16;
        // }
        // System.out.println(Arrays.toString(arr));
        // String[] str = new String[num];
        // for(int i = 0;i <num ;i++) {
        //     str[i] = "";
        //     for(int j = 0;j< 5 - Integer.toString(arr[i]).length();j++) {
        //         str[i] = str[i] + "0";
        //     }
        //     str[i] = str[i] + Integer.toString(arr[i]);
        // }
        // System.out.println(Arrays.toString(str));

        // k = 0;
        //     for(int i = 1 ; i<=5; i++) {
        //         {
        //             for(int j = 0;j<i ; j++) {
        //                 System.out.print(str[k]);
        //                 System.out.print(" ");
        //                 k = k+1;
        //             }
        //             System.out.println();
        //         }
      
                
        //     }
        int n, a = 0, b = 3, i, re, j;
    Scanner sc = new Scanner (System.in);
      n = sc.nextInt ();
    for (i = 1; i <= n; i++)
      {
	for (j = 1; j <= i; j++)
	  {
	    a = a + 2;
	    if (i == 1)
	      b = 3;
	    else
	      b = b + 4;
	    re = a * b;
	    System.out.println (re);
	  }
	System.out.println ();
      }
  }
        }


