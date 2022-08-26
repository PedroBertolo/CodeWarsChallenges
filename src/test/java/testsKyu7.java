import kyu7.HighestAndLowest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testsKyu7 {
    @Test
    @DisplayName("HighestAndLowest - highAndLow")
    public void testOfHighestLowest() {
        assertEquals("42 -9", HighestAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        assertEquals("3 1", HighestAndLowest.highAndLow("1 2 3"));
    }

}
