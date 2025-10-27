package test.java.solutions;

import org.junit.Test;
import solutions.ContainerWithMostWater;

import static org.junit.Assert.assertEquals;

public class ContainerWithMostWaterTest {

    private final ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();

    @Test
    public void testMaxArea1() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected = 49;
        assertEquals(expected, containerWithMostWater.maxArea(height));
    }

    @Test
    public void testMaxArea2() {
        int[] height = {1, 1};
        int expected = 1;
        assertEquals(expected, containerWithMostWater.maxArea(height));
    }
}
