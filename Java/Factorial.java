class Factorial {
    static int fact(int n) {
        if(n == 0) {
            return 1;
        } else {
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        int num = 7;
        int fact = fact(num);
        System.out.println(fact);
    }
}