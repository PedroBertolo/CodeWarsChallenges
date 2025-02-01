import kyu6.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class testsKyu6 {

    @Test
    @DisplayName("CreatePhoneNumber - createPhoneNumber")
    public void createPhoneNumberTest() {
        assertEquals("(123) 456-7890", CreatePhoneNumber.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("BreakCamelCase - camelCase")
    public void tests() {
        assertEquals("camel Casing", BreakCamelCase.camelCase("camelCasing"));
        assertEquals("camel Casing Test", BreakCamelCase.camelCase("camelCasingTest"));
        assertEquals("camelcasingtest", BreakCamelCase.camelCase("camelcasingtest"));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("BuildTower - towerBuilder")
    public void basicTestsBuildTower() {
        assertEquals(String.join(",", "*"), String.join(",", BuildTower.towerBuilder(1)));
        assertEquals(String.join(",", " * ", "***"), String.join(",", BuildTower.towerBuilder(2)));
        assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", BuildTower.towerBuilder(3)));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("FindMissingLetter - findMissingLetter")
    public void exampleTests() {
        assertEquals('e', FindMissingLetter.findMissingLetter(new char[]{'a', 'b', 'c', 'd', 'f'}));
        assertEquals('P', FindMissingLetter.findMissingLetter(new char[]{'O', 'Q', 'R', 'S'}));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("DashatizeIt - dashatize")
    public void testBasic() {
        assertEquals("2-7-4", DashatizeIt.dashatize(274));
        assertEquals("5-3-1-1", DashatizeIt.dashatize(5311));
        assertEquals("86-3-20", DashatizeIt.dashatize(86320));
        assertEquals("9-7-4-3-02", DashatizeIt.dashatize(974302));
    }

    @Test
    @DisplayName("DashatizeIt - dashatize")
    public void testWeird() {
        assertEquals("0", DashatizeIt.dashatize(0));
        assertEquals("1", DashatizeIt.dashatize(-1));
        assertEquals("28-3-6-9", DashatizeIt.dashatize(-28369));
    }

    @Test
    @DisplayName("DashatizeIt - dashatize")
    public void testEdgeCases() {
        assertEquals("2-1-4-7-48-3-64-7", DashatizeIt.dashatize(Integer.MAX_VALUE));
        assertEquals("2-1-4-7-48-3-648", DashatizeIt.dashatize(Integer.MIN_VALUE));
        assertEquals("1-1-1-1-1-1-1-1-1-1", DashatizeIt.dashatize(-1111111111));
    }

//    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("StringSplit - solution")
    public void testEvenString() {
        String s = "abcdef";
        String s1 = "HelloWorld";
        assertEquals("[ab, cd, ef]", Arrays.toString(StringSplit.solution(s)));
        assertEquals("[He, ll, oW, or, ld]", Arrays.toString(StringSplit.solution(s1)));
    }

    @Test
    @DisplayName("StringSplit - solution")
    public void testOddString() {
        String s = "abcde";
        String s1 = "LovePizza";
        assertEquals("[ab, cd, e_]", Arrays.toString(StringSplit.solution(s)));
        assertEquals("[Lo, ve, Pi, zz, a_]", Arrays.toString(StringSplit.solution(s1)));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("CamelCaseMethod - camelCase")
    public void testTwoWords() {
        assertEquals("TestCase", CamelCaseMethod.camelCase("test case"));
    }

    @Test
    @DisplayName("CamelCaseMethod - camelCase")
    public void testThreeWords() {
        assertEquals("CamelCaseMethod", CamelCaseMethod.camelCase("camel case method"));
        assertEquals("CamelCaseWord", CamelCaseMethod.camelCase(" camel case word"));
        assertEquals("Z", CamelCaseMethod.camelCase("z"));
        assertEquals("AbC", CamelCaseMethod.camelCase("ab  c"));
        assertEquals("", CamelCaseMethod.camelCase(""));
    }

    //    ----------------------- SEPARATOR -----------------------

    @DisplayName("TenMinWalkTest")
    private static void tenMinWalkTest(char[] input, boolean expected) {
        String message = "for input = " + Arrays.toString(input);
        boolean actual = TenMinWalk.isValid(input);
        assertEquals(expected, actual, message);
    }

    @Test
    @DisplayName("TenMinWalkTest - test")
    void falseWalkTooShort() {
        tenMinWalkTest(new char[]{'n'}, false);
        tenMinWalkTest(new char[]{'n', 's'}, false);
    }

    @Test
    @DisplayName("TenMinWalkTest - test")
    void falseWalkTooLong() {
        tenMinWalkTest(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}, false);
        tenMinWalkTest(new char[]{'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's', 'e', 'w'}, false);
        tenMinWalkTest(new char[]{'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's', 'e', 'w'}, false);
    }

    @Test
    @DisplayName("TenMinWalkTest - test")
    void falseDoesNotLoopBackToStart() {
        tenMinWalkTest(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 'n'}, false);
        tenMinWalkTest(new char[]{'e', 'e', 'e', 'w', 'n', 's', 'n', 's', 'e', 'w'}, false);
        tenMinWalkTest(new char[]{'n', 'e', 'n', 'e', 'n', 'e', 'n', 'e', 'n', 'e'}, false);
        tenMinWalkTest(new char[]{'n', 'w', 'n', 'w', 'n', 'w', 'n', 'w', 'n', 'w'}, false);
        tenMinWalkTest(new char[]{'s', 'e', 's', 'e', 's', 'e', 's', 'e', 's', 'e'}, false);
        tenMinWalkTest(new char[]{'s', 'w', 's', 'w', 's', 'w', 's', 'w', 's', 'w'}, false);
    }

    @Test
    @DisplayName("TenMinWalkTest - test")
    void trueIsValid10MinutesWalk() {
        tenMinWalkTest(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}, true);
        tenMinWalkTest(new char[]{'e', 'w', 'e', 'w', 'n', 's', 'n', 's', 'e', 'w'}, true);
        tenMinWalkTest(new char[]{'n', 's', 'e', 'w', 'n', 's', 'e', 'w', 'n', 's'}, true);
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("CountingDuplicates - duplicateCount")
    public void abcdeReturnsZero() {
        assertEquals(0, CountingDuplicates.duplicateCount("abcde"));
    }

    @Test
    @DisplayName("CountingDuplicates - duplicateCount")
    public void abcdeaReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("abcdea"));
    }

    @Test
    @DisplayName("CountingDuplicates - duplicateCount")
    public void indivisibilityReturnsOne() {
        assertEquals(1, CountingDuplicates.duplicateCount("indivisibility"));
    }

    @Test
    @DisplayName("CountingDuplicates - duplicateCount")
    public void reallyLongStringContainingDuplicatesReturnsThree() {
        String testThousandA = new String(new char[1000]).replace('\0', 'a');
        String testHundredB = new String(new char[100]).replace('\0', 'b');
        String testTenC = new String(new char[10]).replace('\0', 'c');
        String test1CapitalA = new String(new char[1]).replace('\0', 'A');
        String test1d = new String(new char[1]).replace('\0', 'd');
        String test = test1d + test1CapitalA + testTenC +
                testHundredB + testThousandA;
        assertEquals(3, CountingDuplicates.duplicateCount(test));
    }

    //    ----------------------- SEPARATOR -----------------------

    @Test
    @DisplayName("BouncingBall - bouncingBall")
    public void test1() {
        assertEquals(3, BouncingBall.bouncingBall(3.0, 0.66, 1.5));
    }

    @Test
    @DisplayName("BouncingBall - bouncingBall")
    public void test2() {
        assertEquals(15, BouncingBall.bouncingBall(30.0, 0.66, 1.5));
    }

    //    ----------------------- SEPARATOR -----------------------

    @DisplayName("TwoSum - twoSum")
    public static Stream<Arguments> twoSumBasicTestes() {
        return Stream.of(
                arguments(new int[]{1, 2, 3}, 4, new int[]{0, 2}),
                arguments(new int[]{1234, 5678, 9012}, 14690, new int[]{1, 2}),
                arguments(new int[]{2, 2, 3}, 4, new int[]{0, 1}),
                arguments(new int[]{2, 3, 1}, 4, new int[]{1, 2})
        );
    }

    @ParameterizedTest(name = "numbers: {0}, target: {1}, expected: {2}")
    @MethodSource
    @DisplayName("TwoSum - twoSum")
    void twoSumBasicTestes(int[] numbers, int target, int[] expected) {
        int[] actual = TwoSum.twoSum(numbers.clone(), target);
        assertNotNull(actual, "Should return an array");
        assertEquals(2, actual.length, "Returned array must be of length 2");
        assertNotEquals(actual[0], actual[1], "Indices must be distinct");
        int num1 = numbers[actual[0]];
        int num2 = numbers[actual[1]];
        assertEquals(target, num1 + num2, String.format("Numbers %d, %d at positions %d, %d do not add up to target", num1, num2, actual[0], actual[1]));
    }

}
