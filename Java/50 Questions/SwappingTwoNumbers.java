
class SwappingTwoNumbers {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        b = b + a;
        a = b - a;
        b = b - a;
        System.out.println(a);
        System.out.println(b);
        
    }
}