
class SumOfNaturalNumbers {
    static int sumOfnaturalNumbers(int n) {
        if(n == 1) {
            return 1;
        }

        return n + sumOfnaturalNumbers(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        int sum = sumOfnaturalNumbers(n);
        System.out.println(sum);
    }
}