package kyu7;

/*
    In this little assignment you are given a string of space separated numbers, and have to return the highest and lowest number.

    Examples
    highAndLow("1 2 3 4 5")  // return "5 1"
    highAndLow("1 2 -3 4 5") // return "5 -3"
    highAndLow("1 9 3 4 -5") // return "9 -5"
 */
public class HighestAndLowest {

    public static String highAndLow(String numbers) {
        int largerNumber = 0;
        int lowerNumber = 0;
        String[] arrayOfStrings = numbers.split(" ");

        for (int i = 0; i < arrayOfStrings.length; i++) {
            int firstNumber = Integer.valueOf(arrayOfStrings[i]);

            if (firstNumber > largerNumber || i == 0) {
                largerNumber = firstNumber;
            }
            if (firstNumber < lowerNumber || i == 0) {
                lowerNumber = firstNumber;
            }
        }
        return String.valueOf(largerNumber + " " + lowerNumber);
    }
}
