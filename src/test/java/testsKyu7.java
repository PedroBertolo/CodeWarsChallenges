import kyu7.HighestAndLowest;
import kyu7.ReverseWords;
import kyu7.StringEndsWith;
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

    @Test
    @DisplayName("StringEndsWith - solution")
    public void testOfStringEndsWith() {
        check("samurai", "ai", true);
        check("sumo", "omo", false);
        check("ninja", "ja", true);
        check("sensei", "i", true);
        check("samurai", "ra", false);
        check("abc", "abcd", false);
        check("abc", "abc", true);
        check("abcabc", "bc", true);
        check("ails", "fails", false);
        check("fails", "ails", true);
        check("this", "fails", false);
        check("this", "", true);
        check(":-)", ":-(", false);
        check("!@#$%^&*() :-)", ":-)", true);
        check("abc\n", "abc", false);
    }

    private static void check(String str, String ending, boolean expected) {
        boolean result = StringEndsWith.solution(str, ending);
        assertEquals(expected, result, "Expected solution(\"" + str + "\", \"" + ending + "\") to return " + expected);
    }

    @Test
    @DisplayName("ReverseWords - reverseWords")
    public void testOfReverseWords() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWords.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", ReverseWords.reverseWords("apple"));
        assertEquals("a b c d", ReverseWords.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", ReverseWords.reverseWords("double  spaced  words"));
    }

}
