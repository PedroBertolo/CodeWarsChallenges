package kyu7;

//https://www.codewars.com/kata/566efcfbf521a3cfd2000056/train/java

public class ReversingFun {

    public static String funReverse(String s) {

        if (s == null || s.isEmpty()) return "";

        StringBuilder toReturn = new StringBuilder();
        String tempString = new StringBuilder(s).reverse().toString();
        int counter = 0;

        while (counter != s.length()) {
            toReturn.append(tempString.substring(0, 1));
            tempString = new StringBuilder(tempString.substring(1)).reverse().toString();
            counter++;
        }

        return toReturn.toString();
    }

}
