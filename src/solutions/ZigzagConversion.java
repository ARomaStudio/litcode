package solutions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZigzagConversion {

    public String convert(String s, int numRows) {
        Map<Integer, List<Character>> a = new HashMap<>();
        char[] caracters = s.toCharArray();
        boolean isForward = true;
        int row = 1;
        for (char c : caracters){
            if(a.get(row) == null){
                ArrayList l = new ArrayList();
                l.add(c);
                a.put(row, l);
            } else {
                a.get(row).add(c);
            }
            if(row == numRows){
                isForward = false;
            }
            if(row == 1) {
                isForward = true;
            }
            if (isForward) {
                row++;
            } else {
                row--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (List<Character> r: a.values()){
            for (Character c: r) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
