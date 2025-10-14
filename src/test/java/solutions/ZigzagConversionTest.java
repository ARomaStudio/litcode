package test.java.solutions;

import org.junit.Test;
import solutions.ZigzagConversion;

import static org.junit.Assert.assertEquals;

public class ZigzagConversionTest {

    private final ZigzagConversion zigzagConversion = new ZigzagConversion();

    @Test
    public void testConvert1() {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";
        assertEquals(expected, zigzagConversion.convert(s, numRows));
    }

    @Test
    public void testConvert2() {
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";
        assertEquals(expected, zigzagConversion.convert(s, numRows));
    }

    @Test
    public void testConvert3() {
        String s = "A";
        int numRows = 1;
        String expected = "A";
        assertEquals(expected, zigzagConversion.convert(s, numRows));
    }

}
