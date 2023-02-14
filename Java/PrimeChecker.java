import java.util.Scanner;

public class PrimeChecker {

    boolean isPrime(int n) {
        if (n == 0) {
            return false;
        }

        if (n == 1) {
            return true;
        }

        for (int i = 2;i< n/2; i++) {
            if (n%i ==0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrimeChecker ch = new PrimeChecker();
        boolean prime = ch.isPrime(n);
        System.out.println(prime);

    }
}
