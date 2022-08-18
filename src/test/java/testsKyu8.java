import kyu8.PositveSum;
import kyu8.SumWithoutHighestLowest;
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
    public void BasicTests() {
        assertEquals(26, SumWithoutHighestLowest.sum(new int[] { 6, 2, 1, 8, 10, 10}));
    }

}
