

public class Fibonnaci {
    
    static void fibonacci(int num) {
        int a = 0;
        int b = 1;
        int c = 0;
        while(num>0) {
            c = a+b;
            System.out.print(c + " ");
            a = b;
            b = c;
            num--;
        }
    }

    public static void main(String[] args) {
        int num = 10;
        fibonacci(num);
    }
}
