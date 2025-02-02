package kyu7;

//https://www.codewars.com/kata/559590633066759614000063/train/java

import java.util.Arrays;

public class MinMax {

    public static int[] minMax(int[] arr) {
        return new int[]{Arrays.stream(arr).min().getAsInt(), Arrays.stream(arr).max().getAsInt()};
    }

}
