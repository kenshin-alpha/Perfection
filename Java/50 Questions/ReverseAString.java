

public class ReverseAString {
    static String reverseAString(String str) {
        StringBuilder sc = new StringBuilder(str);
        sc = sc.reverse();
        str = sc.toString();
        return str;
    }

    public static void main(String[] args) {
        String str = "adbda";
        String s = "";
        for(int i = str.length()-1;i>=0;i--) {
            s = s + str.charAt(i);   
        }
        if(str.equals(s)){
            System.out.println("Pallindrome");
        }
        str = reverseAString(str);
        System.out.println(str);
    }
}
