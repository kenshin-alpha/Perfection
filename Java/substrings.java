import java.util.ArrayList;

class substrings{
    public static void main(String[] args) {
        String str = "Hello";
        ArrayList ab = new ArrayList();
        for (int i = 0;i<str.length()+1;i++){
            for(int j = i+1; j<str.length()+1; j++) {
                ab.add(str.substring(i, j));
            }
        }
        ab.add(23);
        for (Object a: ab) {
            System.out.println(a.toString());
        }
    }
}