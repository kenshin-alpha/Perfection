

public class ReverseAString {
    static String reverseAString(String str) {
        StringBuilder sc = new StringBuilder(str);
        sc = sc.reverse();
        str = sc.toString();
        return str;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        str = reverseAString(str);
        System.out.println(str);
    }
}
