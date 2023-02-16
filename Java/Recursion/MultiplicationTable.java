

class MultiplicationTable {
    static void multiplicationTable(int num,int key) {
        if(key == 11) {
            return ;
        }

        System.out.println(num +" * "+ key+ " = " + num*key );
        multiplicationTable(num, key+1);
    }

    public static void main(String[] args) {
        multiplicationTable(10, 1);
    }
}
