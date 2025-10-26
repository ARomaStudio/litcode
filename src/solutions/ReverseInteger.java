package solutions;

public class ReverseInteger {

    public int reverse(int x) {
        boolean isNegative = x<0;
        String s = String.valueOf(Math.abs(x));
        char[] a = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = a.length - 1; i >= 0; i--) {
            sb.append(a[i]);
        }
        try {
            if (isNegative) {
                return Integer.parseInt("-"+sb.toString());
            }
            return Integer.parseInt(sb.toString());
        } catch(NumberFormatException e) {
            return 0;
        }
    }

}
