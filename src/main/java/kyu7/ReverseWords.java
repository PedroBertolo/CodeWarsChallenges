package kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
    Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.

        Examples
        "This is an example!" ==> "sihT si na !elpmaxe"
        "double  spaces"      ==> "elbuod  secaps"
 */
public class ReverseWords {
    public static String reverseWords(final String original) {
        List<String> listOfStrings = new ArrayList<>();
        String[] arrayOfOriginalString = original.split(" ");

        if (arrayOfOriginalString.length == 0) {
            return original;
        }

        Arrays.stream(arrayOfOriginalString).forEach(x -> {
            listOfStrings.add(new StringBuilder(x).reverse().toString());
        });

        return String.join(" ", listOfStrings);
    }

}
//        for (int i = 0; i < arrayOfOriginalString.length; i++) {
//            arrayOfOriginalString[i] = new
//        }
//
//        int i = 0;
//        for (
//                String string : array) {
//            array[i] = new StringBuilder(string).reverse().toString();
//            i++;
//        }