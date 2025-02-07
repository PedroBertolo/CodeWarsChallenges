import kyu8.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class TestsKyu8 {

    @Test
    @DisplayName("PositiveSum - sum")
    public void testPositiveSum() {
        assertEquals(15, PositveSum.sum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(13, PositveSum.sum(new int[]{1, -2, 3, 4, 5}));
        assertEquals(0, PositveSum.sum(new int[]{}));
        assertEquals(0, PositveSum.sum(new int[]{-1, -2, -3, -4, -5}));
        assertEquals(9, PositveSum.sum(new int[]{-1, 2, 3, 4, -5}));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("SumWithoutHighestLowest - sum")
    public void testOfSumWithoutHighestLowest() {
        assertEquals(26, SumWithoutHighestLowest.sum(new int[]{6, 2, 1, 8, 10, 10}));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("ReverseStrings - reverse")
    public void reverseTest() {
        assertEquals("dlrow", ReverseStrings.reverseString("world"));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("TestScoreComparison - betterThanAverage")
    public void testScoreComparison() {
        assertEquals(true, TestScoreComparison.betterThanAverage(new int[]{2, 3}, 5));
        assertEquals(true, TestScoreComparison.betterThanAverage(new int[]{100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertEquals(true, TestScoreComparison.betterThanAverage(new int[]{12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertEquals(false, TestScoreComparison.betterThanAverage(new int[]{100, 90}, 11));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("GrasshopperPersonalizedMessage - greet")
    public void greetTest() {
        assertEquals("Hello boss", GrasshopperPersonalizedMessage.greet("Daniel", "Daniel"));
        assertEquals("Hello guest", GrasshopperPersonalizedMessage.greet("Greg", "Daniel"));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("FakeBinary - fakeBin")
    public void fakeBinaryTest() {
        assertEquals("01011110001100111", FakeBinary.fakeBin("45385593107843568"));
        assertEquals("101000111101101", FakeBinary.fakeBin("509321967506747"));
        assertEquals("011011110000101010000011011", FakeBinary.fakeBin("366058562030849490134388085"));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("EvenOrOdd - even_or_odd")
    public void testEvenOrOdd() {
        assertEquals("Even", EvenOrOdd.even_or_odd(6));
        assertEquals("Odd", EvenOrOdd.even_or_odd(7));
        assertEquals("Even", EvenOrOdd.even_or_odd(0));
        assertEquals("Odd", EvenOrOdd.even_or_odd(-1));
    }

    //    ----------------------- SEPARATOR -----------------------

    @DisplayName("SheepCounter - Counting sheep...")
    private static void doTest(Boolean[] input, int expected) {
        SheepCounter counter = new SheepCounter();
        String message = String.format("for array: %s\n", Arrays.toString(input));
        int actual = counter.countSheeps(input);
        assertEquals(expected, actual, message);
    }

    @Test
    @DisplayName("SheepCounter - Counting sheep...")
    void sampleTests() {
        doTest(new Boolean[]{
                true, true, true, false, true, true, true, true, true, false, true,
                false, true, false, false, true, true, true, true, true, false,
                false, true, true
        }, 17);
        doTest(new Boolean[]{false, true, true}, 2);
        doTest(new Boolean[]{}, 0);
        doTest(new Boolean[]{false, null, true, false, null, null, true}, 2);
        doTest(new Boolean[]{false, null, null}, 0);
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("YouOnlyNeedOneBeginner - check")
    public void testYouOnlyNeedOneBeginner() {
        assertTrue(YouOnlyNeedOneBeginner.check(new Object[]{66, 101}, 66));
        assertTrue(YouOnlyNeedOneBeginner.check(new Object[]{80, 117, 115, 104, 45, 85, 112, 115}, 45));
        assertTrue(YouOnlyNeedOneBeginner.check(new Object[]{'t', 'e', 's', 't'}, 'e'));
        assertFalse(YouOnlyNeedOneBeginner.check(new Object[]{"what", "a", "great", "kata"}, "kat"));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("OppositesAttract - isLove")
    public void testOppositesAttract() {
        assertEquals(true, OppositesAttract.isLove(1, 4));
        assertEquals(false, OppositesAttract.isLove(2, 2));
        assertEquals(false, OppositesAttract.isLove(1, 1));
        assertEquals(true, OppositesAttract.isLove(0, 1));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("CalculateAverage - find_average")
    public void testCalculateAverage() {
        double DELTA = 1e-15;
        assertEquals(1, CalculateAverage.find_average(new int[]{1, 1, 1}), DELTA);
        assertEquals(2, CalculateAverage.find_average(new int[]{1, 2, 3}), DELTA);
    }

}
