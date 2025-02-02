package kyu6;

//https://www.codewars.com/kata/55c45be3b2079eccff00010f/train/java

import java.util.HashMap;
import java.util.Map;

public class YourOrderPlease {

    public static String order(String words) {

        if (words == null || words.isEmpty()) return "";

        Map<Integer, String> orderOfWords = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();

        String[] word = words.split(" ");
        for (String s : word) {
            orderOfWords.put(Integer.parseInt(s.replaceAll("[^0-9]", "")), s);
        }

        for (int i = 1; i < word.length + 1; i++) {
            stringBuilder.append(orderOfWords.get(i) + " ");
        }

        return stringBuilder.toString().trim();
    }

}
