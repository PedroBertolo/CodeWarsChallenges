import kyu7.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

public class TestsKyu7 {

    @Test
    @DisplayName("HighestAndLowest - highAndLow")
    public void testOfHighestLowest() {
        assertEquals("42 -9", HighestAndLowest.highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
        assertEquals("3 1", HighestAndLowest.highAndLow("1 2 3"));
    }

    //    ----------------------- SEPARATOR -----------------------

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

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("ReverseWords - reverseWords")
    public void testOfReverseWords() {
        assertEquals("ehT kciuq nworb xof spmuj revo eht yzal .god", ReverseWords.reverseWords("The quick brown fox jumps over the lazy dog."));
        assertEquals("elppa", ReverseWords.reverseWords("apple"));
        assertEquals("a b c d", ReverseWords.reverseWords("a b c d"));
        assertEquals("elbuod  decaps  sdrow", ReverseWords.reverseWords("double  spaced  words"));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("Mumbling - accum")
    public void test() {
        System.out.println("Fixed Tests accum");
        testing(Mumbling.accum("ZpglnRxqenU"), "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu");
        testing(Mumbling.accum("NyffsGeyylB"), "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb");
        testing(Mumbling.accum("MjtkuBovqrU"), "M-Jj-Ttt-Kkkk-Uuuuu-Bbbbbb-Ooooooo-Vvvvvvvv-Qqqqqqqqq-Rrrrrrrrrr-Uuuuuuuuuuu");
        testing(Mumbling.accum("EvidjUnokmM"), "E-Vv-Iii-Dddd-Jjjjj-Uuuuuu-Nnnnnnn-Oooooooo-Kkkkkkkkk-Mmmmmmmmmm-Mmmmmmmmmmm");
        testing(Mumbling.accum("HbideVbxncC"), "H-Bb-Iii-Dddd-Eeeee-Vvvvvv-Bbbbbbb-Xxxxxxxx-Nnnnnnnnn-Cccccccccc-Ccccccccccc");
    }

    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("Switcheroo - switcheroo")
    public void testSomething() {
        assertEquals("abc", Switcheroo.switcheroo("bac"));
        assertEquals("ccc", Switcheroo.switcheroo("ccc"));
        assertEquals("aaabcccbaaa", Switcheroo.switcheroo("bbbacccabbb"));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("IsThisATriangle - isTriangle")
    public void testIfIsATrinagle() {
        assertEquals(true, IsThisATriangle.isTriangle(1, 2, 2));
        assertEquals(false, IsThisATriangle.isTriangle(7, 2, 2));
    }

//    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("GrowthOfPopulation - nbYear")
    public void test1() {
        System.out.println("Fixed Tests: nbYear");
        assertEquals(GrowthOfPopulation.nbYear(1500, 5, 100, 5000), 15);
        assertEquals(GrowthOfPopulation.nbYear(1500000, 2.5, 10000, 2000000), 10);
        assertEquals(GrowthOfPopulation.nbYear(1500000, 0.25, 1000, 2000000), 94);
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("LineNumbering - number")
    public void basicTests() {
        assertIterableEquals(Arrays.asList(), LineNumbering.number(Arrays.asList()));
        assertIterableEquals(Arrays.asList("1: a", "2: b", "3: c"), LineNumbering.number(Arrays.asList("a", "b", "c")));
        assertIterableEquals(Arrays.asList("1: ", "2: ", "3: ", "4: ", "5: "), LineNumbering.number(Arrays.asList("", "", "", "", "")));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("MinMax - minMax")
    public void testExampleCases() {
        assertArrayEquals(new int[]{1, 5}, MinMax.minMax(new int[]{1, 2, 3, 4, 5}));
        assertArrayEquals(new int[]{5, 2334454}, MinMax.minMax(new int[]{2334454, 5}));
        assertArrayEquals(new int[]{1, 1}, MinMax.minMax(new int[]{1}));
    }

    @Test
    @DisplayName("MinMax - minMax")
    public void minMaxRandomTest() {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int r = rand.nextInt();
            assertArrayEquals(new int[]{r, r}, MinMax.minMax(new int[]{r}));
        }
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("OddOrEven - oddOrEven")
    public void exampleTest() {
        assertEquals("odd", OddOrEven.oddOrEven(new int[]{2, 5, 34, 6}));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("AnagramDetection - isAnagram")
    void sampleTests() {
        doisAnagramTest("", "", true);
        doisAnagramTest("ab", "cdcd", false);
        doisAnagramTest("ac", "bb", false);
        doisAnagramTest("aab", "abb", false);
        doisAnagramTest("a", "aaa", false);
        doisAnagramTest("foefet", "toffee", true);
        doisAnagramTest("Buckethead", "DeathCubeK", true);
        doisAnagramTest("Twoo", "Woot", true);
        doisAnagramTest("dumble", "bumble", false);
        doisAnagramTest("ound", "round", false);
        doisAnagramTest("apple", "pale", false);
    }

    public void doisAnagramTest(String a, String b, boolean expected) {
        String message = String.format("a = \"%s\"\nb = \"%s\"\n", a, b);
        boolean actual = AnagramDetection.isAnagram(a, b);
        assertEquals(expected, actual, message);
    }

//    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("ReversingFun - funReverse")
    void reversingFunTests() {
        doReversingFunTests("0", "0");
        doReversingFunTests("", "");
        doReversingFunTests("012", "201");
        doReversingFunTests("012345", "504132");
        doReversingFunTests("0123456789", "9081726354");
        doReversingFunTests("Hello", "oHlel");
        doReversingFunTests("4ppso1vdjc9rjyf5bkmd5nztr8", "84rptpzsno51dvmdkjbc59fryj");
    }

    private static void doReversingFunTests(String input, String expected) {
        String message = String.format("for input \"%s\"\n", input);
        String actual = ReversingFun.funReverse(input);
        assertEquals(expected, actual, message);
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("MaxMinArrays - solve")
    public void testsMaxMinArrays() {
        assertArrayEquals(new int[]{15, 7, 12, 10, 11}, MaxMinArrays.solve(new int[]{15, 11, 10, 7, 12}));
        assertArrayEquals(new int[]{15, 7, 12, 10, 11}, MaxMinArrays.solve(new int[]{15, 11, 10, 7, 12}));
        assertArrayEquals(new int[]{15, 7, 12, 10, 11}, MaxMinArrays.solve(new int[]{15, 11, 10, 7, 12}));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("ShortestWord - findShort")
    void findShort() {
        assertEquals(3, ShortestWord.findShort("bitcoin take over the world maybe who knows perhaps"));
        assertEquals(3, ShortestWord.findShort("turns out random test cases are easier than writing out basic ones"));
        assertEquals(2, ShortestWord.findShort("Let's travel abroad shall we"));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("GetMiddle - getMiddle")
    public void evenTests() {
        assertEquals("es", GetMiddle.getMiddle("test"));
        assertEquals("dd", GetMiddle.getMiddle("middle"));
    }

    @Test
    @DisplayName("GetMiddle - getMiddle")
    public void oddTests() {
        assertEquals("t", GetMiddle.getMiddle("testing"));
        assertEquals("A", GetMiddle.getMiddle("A"));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("DescendingOrder - sortDesc")
    public void test_01() {
        assertEquals(0, DescendingOrder.sortDesc(0));
        assertEquals(51, DescendingOrder.sortDesc(15));
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("XO - getXO")
    public void sampleTestsXO() {
        assertEquals(true, XO.getXO("ooxx"));
        assertEquals(false, XO.getXO("xooxx"));
        assertEquals(true, XO.getXO("ooxXm"));
        assertEquals(true, XO.getXO("zpzpzpp"));
        assertEquals(false, XO.getXO("zzoo"));
        assertEquals(true, XO.getXO("xxxooo"));
        assertEquals(true, XO.getXO("xxxXooOo"));
        assertEquals(false, XO.getXO("xxx23424esdsfvxXXOOooo"));
        assertEquals(false, XO.getXO("xXxxoewrcoOoo"));
        assertEquals(false, XO.getXO("XxxxooO"));
        assertEquals(true, XO.getXO("zssddd"));
        assertEquals(false, XO.getXO("Xxxxertr34"));
        assertEquals(true, XO.getXO(""));
    }

}



