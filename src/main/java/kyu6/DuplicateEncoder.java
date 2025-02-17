package kyu6;

//https://www.codewars.com/kata/54b42f9314d9229fd6000d9c/train/java

import java.util.HashMap;

public class DuplicateEncoder {

    public static String encode(String word) {
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();

        String[] wordSplitted = word.toLowerCase().split("");

        for (String s : wordSplitted) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
                continue;
            }
            map.put(s, map.get(s) + 1);
        }

        for (String s : wordSplitted) {
            Integer i = map.get(s);
            stringBuilder.append(map.get(s) == 1 ? "(" : ")");
        }

        return stringBuilder.toString();
    }

}
