package solutions;

import java.util.HashMap;
import java.util.Map;


public class AlphabetPosition {

    static String alphabetPosition(String text) {
        Map<Character, Integer> m = new HashMap<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            m.put(ch, ch - 'a' + 1);
        }
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            m.put(ch, ch - 'A' + 1);
        }
        char[] ca = text.toCharArray();
        String result = "";
        for (int i = 0; i<ca.length; i++) {
            Integer t = m.get(ca[i]);
            if (t != null) {
                result = result + " " + t;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(alphabetPosition("The sunset sets at twelve o' clock."));
    }

}
