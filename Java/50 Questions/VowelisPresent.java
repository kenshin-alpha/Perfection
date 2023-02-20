

public class VowelisPresent {
    
    static boolean vowelisPresent(String str){
        return str.toLowerCase().matches(".*[aeiou].*");
    }

    public static void main(String[] args) {
        String str = "bcdg";
        String str2 = "abdc";
        System.out.println(vowelisPresent(str));
        System.out.println(vowelisPresent(str2));
    }

}
