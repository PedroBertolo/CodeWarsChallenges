package kyu6;
/*
https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1/train/java
 */

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class CountingDuplicates {

    public static int duplicateCount(String text) {
        String[] splittedString = text.toLowerCase().split("");
        HashMap<String, Integer> map = new HashMap<>();

        for (String s : splittedString) {
            Integer numberOfTimes = map.get(s);
            // new entry
            if (numberOfTimes == null) {
                map.put(s, 0);
                continue;
            }
            // if it has that key, adds 1
            map.put(s, map.get(s) + 1);
        }

        List<Integer> collect = map.values()
                .stream()
                .filter(integer -> integer > 0)
                .collect(Collectors.toList());

        return collect.size();
    }

}
