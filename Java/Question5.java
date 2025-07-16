import java.util.Scanner;
import java.util.Stack;

public class Question5 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       String str = sc.next();
       char[] ch= str.toCharArray();
       int temp = 0;
       int l = 0;
       int count = 0;
        for(char a : ch) {
            if(a == 'U') {
                temp = l;
                l = l+1;
            } else {
                temp = l;
                l = l-1;
            }
            if(l==0 && temp<0) {
                count++;
            }
        }
        System.out.println(count);
        sc.close();

        Stack<Character> st = new Stack<>();
        char c = 'd';
        int coun = 0;
        for(char a :ch) {
            if(st.empty()) st.push(a);
            else if(st.peek() == 'U') {
                if(a == 'U') 
                    st.push(a);
                else 
                    c = st.pop();
            }
            else if(st.peek() == 'D') {
                if(a == 'D') 
                    st.push(a);
                else 
                    c = st.pop();
            }
            if(st.empty() && c == 'D') 
                coun++;
           
        }

        System.out.println(coun);
        

        
   } 
}
