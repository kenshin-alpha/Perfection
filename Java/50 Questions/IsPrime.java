

class IsPrime {
    static String isPrime(int num) {
        for (int i = 2; i<num ;i++) {
            if(num%i == 0) {
                return ("Not Prime");
            }
        }
        
            return("Prime");
        
    }

    public static void main(String[] args) {
        int num = 70;
        System.out.println(isPrime(num));
        num = 43;
        System.out.println(isPrime(num));
    }

}
