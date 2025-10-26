package solutions;

public class AtoiStringConversion {

    private static final int INT_MIN = -2147483648;
    private static final int INT_MAX = 2147483647;

    public int myAtoi(String s) {
        s = s.trim();
        boolean isNegative = false;
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        if (chars[0] == '0') {
            int count = 0;
            for (char c : chars) {
                if (c == '0') {
                    count++;
                }
            }
            s = s.substring(count);
            if (!Character.isDigit(s.toCharArray()[0])) {
                return 0;
            }
        }
        if (chars[0] == '-') {
            isNegative = true;
        }
        s = s.replaceAll("\\+", "");
        s = s.replaceAll("-", "");
        chars = s.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                sb.append(c);
            } else {
                break;
            }
        }
        if (isNegative) {
            try {
                return Integer.parseInt("-" + sb.toString());
            } catch (NumberFormatException ex) {
                return INT_MIN;
            }
        }
        if (sb.toString().isEmpty()) {
            return 0;
        }
        try {
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException ex) {
            return INT_MAX;
        }
    }
}

