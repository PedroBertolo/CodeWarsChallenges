package kyu8;

import java.util.Arrays;
    /*
    Sum all the numbers of a given array ( cq. list ), except the highest and the lowest element ( by value, not by index! ).
    The highest or lowest element respectively is a single element at each edge, even if there are more than one with the same value.
    If an empty value ( null, None, Nothing etc. ) is given instead of an array, or the given array is an empty list or a list with only 1 element, return 0.

    Example
    { 6, 2, 1, 8, 10 } => 16
    { 1, 1, 11, 2, 3 } => 6
     */
public class SumWithoutHighestLowest {
    public static int sum(int[] numbers) {
        if (numbers == null || numbers.length < 2) return 0;
        return Arrays.stream(numbers).sorted().skip(1).limit(numbers.length - 2).sum();
    }
}