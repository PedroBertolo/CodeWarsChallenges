package kyu8;

//https://www.codewars.com/kata/57a2013acf1fa5bfc4000921/train/java

import java.util.Arrays;

public class CalculateAverage {

    public static double find_average(int[] array) {

        if (array == null || array.length == 0) return 0;

        return (double) Arrays.stream(array).sum() / array.length;
    }

}
