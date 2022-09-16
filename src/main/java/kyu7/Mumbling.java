package kyu7;
/*
This time no story, no theory. The examples below show you how to write function accum:

    Examples:
    accum("abcd") -> "A-Bb-Ccc-Dddd"
    accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy"
    accum("cwAt") -> "C-Ww-Aaa-Tttt"

The parameter of accum is a string which includes only letters from a..z and A..Z.
 */

public class Mumbling {
    public static String accum(String s) {
        StringBuilder finalBuilder = new StringBuilder();
        String[] splittedString = s.split("");

        for (int i = 0; i < splittedString.length; i++) {
            if (i == 0) {
                finalBuilder.append(splittedString[i].toUpperCase()).append("-");
                continue;
            }

            StringBuilder repeatWordsBuilder = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    repeatWordsBuilder.append(splittedString[i].toUpperCase());
                    continue;
                }
                repeatWordsBuilder.append(splittedString[i].toLowerCase());
            }

            finalBuilder.append(repeatWordsBuilder.toString());
            if (i != splittedString.length - 1) {
                finalBuilder.append("-");
            }
        }
        return finalBuilder.toString();
    }
}
