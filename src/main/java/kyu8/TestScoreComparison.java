package kyu8;

import java.sql.Array;
import java.util.Arrays;

/*
    You receive an array with your peers' test scores. Now calculate the average and compare your score!

    Return True if you're better, else False!
 */
public class TestScoreComparison {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        double average = Arrays.stream(classPoints).average().getAsDouble();
        return !(average > yourPoints);
    }

}
