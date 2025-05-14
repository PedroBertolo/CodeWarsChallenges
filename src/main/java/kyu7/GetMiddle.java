package kyu7;

//https://www.codewars.com/kata/56747fd5cb988479af000028/java

public class GetMiddle {

    public static String getMiddle(String word) {
        int middleLengthWord = word.length() / 2;
        return word.length() % 2 == 0 ? word.substring(middleLengthWord - 1, middleLengthWord + 1) : word.substring(middleLengthWord, middleLengthWord + 1);
    }

}
