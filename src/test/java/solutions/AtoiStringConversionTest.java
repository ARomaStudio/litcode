package solutions;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AtoiStringConversionTest {

    private final AtoiStringConversion atoiStringConversion = new AtoiStringConversion();

    @Test
    public void testMyAtoi1() {
        String s = "42";
        int expected = 42;
        assertEquals(expected, atoiStringConversion.myAtoi(s));
    }

    @Test
    public void testMyAtoi2() {
        String s = "   -042";
        int expected = -42;
        assertEquals(expected, atoiStringConversion.myAtoi(s));
    }

    @Test
    public void testMyAtoi3() {
        String s = "1337c0d3";
        int expected = 1337;
        assertEquals(expected, atoiStringConversion.myAtoi(s));
    }

    @Test
    public void testMyAtoi4() {
        String s = "0-1";
        int expected = 0;
        assertEquals(expected, atoiStringConversion.myAtoi(s));
    }

    @Test
    public void testMyAtoi5() {
        String s = "words and 987";
        int expected = 0;
        assertEquals(expected, atoiStringConversion.myAtoi(s));
    }

    @Test
    public void testMyAtoi6() {
        String s = "-91283472332";
        int expected = -2147483648;
        assertEquals(expected, atoiStringConversion.myAtoi(s));
    }
}
