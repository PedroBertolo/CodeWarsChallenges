package kyu8;

public class  PositveSum {
    /*
    You get an array of numbers, return the sum of all of the positives ones.

    Example [1,-4,7,12] => 1 + 7 + 12 = 20

    Note: if there is nothing to sum, the sum is default to 0.
     */
    public static int sum(int[] arr) {
        int positiveNumbers = 0;

        for (int number: arr) {
            if (number > 0) {
                positiveNumbers += number;
            }
        }
        return positiveNumbers;
    }
}
