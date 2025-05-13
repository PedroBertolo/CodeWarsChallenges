package kyu6;

//https://www.codewars.com/kata/523f5d21c841566fde000009/train/java

import java.util.HashMap;
import java.util.Map;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {

        Map<Integer, Integer> map = new HashMap<>();
        int counter = 0;

        for (int numberListA : a) {
            map.put(counter, numberListA);
            counter++;
        }

        for (int numberListB : b) {
            map.entrySet().removeIf(entry -> entry.getValue().equals(numberListB));
        }

        return map.values().stream().mapToInt(Integer::intValue).toArray();
    }

}
