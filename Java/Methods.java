


import java.lang.reflect.Method;
public class Methods {
   public static void main(String[] argv) throws Exception {
      Class c = StringBuilder.class;
      Method[] methods = c.getMethods();
      for (int i = 0; i < methods.length; i++) {
         System.out.println(methods[i]);
      }
   }
}