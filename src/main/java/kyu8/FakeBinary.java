package kyu8;

import java.util.Arrays;

/*
    Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. Return the resulting string.
    Note: input will never be an empty string
 */
public class FakeBinary {

    public static String fakeBin(String numberString) {
        String[] splittedString = numberString.split("");
        StringBuilder stringBuilder = new StringBuilder();

        for (String string: splittedString) {
           if (Integer.valueOf(string) < 5) {
               stringBuilder.append("0");
           } else {
               stringBuilder.append("1");
           }
        }
        return stringBuilder.toString();
    }
}
