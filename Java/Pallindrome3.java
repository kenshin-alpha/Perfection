import javax.swing.plaf.synth.SynthStyle;

public class Pallindrome3 {

   public static boolean isPallindrome(String s) {
       if(s.length() == 1) {
           return true;
       } 
       StringBuilder sb = new StringBuilder(s);
       sb = sb.reverse();
       String rev = new String(sb);
       
       return rev.equals(s);
   } 
   public static void main(String[] args) {
       String str = "aaabaaa";
       boolean flag = false;
        for(int i = 1; i<str.length()-1;i++) {
            String str1 = str.substring(0, i);
            if(isPallindrome(str1)) {

                for(int j = 1;j<str.length()-i;j++) {
                    String str2 = str.substring(i, i+j);
                    String str3 = str.substring(i+j,str.length());
                    if(isPallindrome(str2) && isPallindrome(str3)) {
                        System.out.println(str1 + "\n" + str2 + "\n" + str3);
                        flag = true;
                        break;
                    }
                }
                if(flag) break;
            }
        }
        if(flag == false) {
            System.out.println("Impossible");
        }
        
   } 

}
