package kyu6;

//https://www.codewars.com/kata/54da5a58ea159efa38000836/train/java

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOdd {

    public static int findIt(int[] a) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int number : a) {
            if (!map.containsKey(number)) {
                map.put(number, 1);
                continue;
            }
            map.put(number, map.get(number) + 1);
        }

        return map.entrySet()
                .stream()
                .filter(valor -> valor.getValue() % 2 != 0)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList())
                .get(0);
    }

}
