import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

class rough {
    public static void main(String[] args) {
    StringBuilder sb = new StringBuilder("Hello");
    sb.replace(1, 4, "li");
    System.out.println(sb.toString());
        

    String s = "Helllo World";
    String s1 = s.replaceAll("[el]", "");
    System.out.println(s1);
    String[] s2 = s.split("[ ]");
    System.out.println(Arrays.toString(s2));
    
    }
}