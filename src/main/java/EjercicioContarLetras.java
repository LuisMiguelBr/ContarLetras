import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class EjercicioContarLetras {


   public static String contarRepeticiones(String input) {

       if (input == null)
           return null;
       char [] letras = input.toLowerCase().toCharArray();
       HashMap<Character, Integer> map = new HashMap<>();
       for (Character i : letras) {
           if (map.containsKey(i)) {
               Integer value = map.get(i);
               value++;
               map.replace(i, value);
           } else {
               map.put(i, 1);
           }
       }
       return map.toString();

   }
}
