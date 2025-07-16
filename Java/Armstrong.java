public class Armstrong {
    public static void main(String[] args) {
        int num = 1000;
        System.out.println(0);
        for(int i = 1; i < num; i++) {
            int temp = i;
            int sum = 0;
            while(temp > 0) {
                int remainder = temp % 10;
                remainder = remainder * remainder * remainder;
                sum = sum + remainder;
                temp = temp / 10;
            }
            if(sum == i) {
                System.out.println(i);
            }
        }
    }
}
