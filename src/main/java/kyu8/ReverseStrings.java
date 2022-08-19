package kyu8;

import java.util.Arrays;

/*
    Complete the solution so that it reverses the string passed into it.
        'world'  =>  'dlrow'
        'word'   =>  'drow'
 */
public class ReverseStrings {
    public static String reverseString(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = str.toCharArray().length; i > 0; i--) {
            stringBuilder.append(str.toCharArray()[i -1]);
        }

        return stringBuilder.toString();
    }
}
