import kyu8.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testsKyu8 {

    @Test
    @DisplayName("PositiveSum - sum")
    public void testPositiveSum() {
        assertEquals(15, PositveSum.sum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(13, PositveSum.sum(new int[]{1, -2, 3, 4, 5}));
        assertEquals(0, PositveSum.sum(new int[]{}));
        assertEquals(0, PositveSum.sum(new int[]{-1, -2, -3, -4, -5}));
        assertEquals(9, PositveSum.sum(new int[]{-1, 2, 3, 4, -5}));
    }

    @Test
    @DisplayName("SumWithoutHighestLowest - sum")
    public void testOfSumWithoutHighestLowest() {
        assertEquals(26, SumWithoutHighestLowest.sum(new int[]{6, 2, 1, 8, 10, 10}));
    }

    @Test
    @DisplayName("ReverseStrings - reverse")
    public void reverseTest() {
        assertEquals("dlrow", ReverseStrings.reverseString("world"));
    }

    @Test
    @DisplayName("TestScoreComparison - betterThanAverage")
    public void testScoreComparison() {
        assertEquals(true, TestScoreComparison.betterThanAverage(new int[]{2, 3}, 5));
        assertEquals(true, TestScoreComparison.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertEquals(true, TestScoreComparison.betterThanAverage(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertEquals(false, TestScoreComparison.betterThanAverage(new int[]{100, 90}, 11));
    }
    @Test
    @DisplayName("GrasshopperPersonalizedMessage - greet")
    public void greetTest() {
        assertEquals("Hello boss", GrasshopperPersonalizedMessage.greet("Daniel", "Daniel"));
        assertEquals("Hello guest", GrasshopperPersonalizedMessage.greet("Greg", "Daniel"));
    }
    @Test
    @DisplayName("FakeBinary - fakeBin")
    public void fakeBinaryTest() {
        assertEquals("01011110001100111", FakeBinary.fakeBin("45385593107843568"));
        assertEquals("101000111101101", FakeBinary.fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011", FakeBinary.fakeBin("366058562030849490134388085"));
    }
    @Test
    @DisplayName("EvenOrOdd - even_or_odd")
    public void testEvenOrOdd() {
        assertEquals("Even", EvenOrOdd.even_or_odd(6));
        assertEquals("Odd", EvenOrOdd.even_or_odd(7));
        assertEquals("Even", EvenOrOdd.even_or_odd(0));
        assertEquals("Odd", EvenOrOdd.even_or_odd(-1));
    }
}
