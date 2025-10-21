package test.java.solutions;

import org.junit.Test;
import solutions.ReverseInteger;

import static org.junit.Assert.assertEquals;

public class ReverseIntegerTest {

    private final ReverseInteger reverseInteger = new ReverseInteger();

    @Test
    public void testReverse1() {
        int x = 123;
        int expected = 321;
        assertEquals(expected, reverseInteger.reverse(x));
    }

    @Test
    public void testReverse2() {
        int x = -123;
        int expected = -321;
        assertEquals(expected, reverseInteger.reverse(x));
    }

    @Test
    public void testReverse3() {
        int x = 120;
        int expected = 21;
        assertEquals(expected, reverseInteger.reverse(x));
    }

}
