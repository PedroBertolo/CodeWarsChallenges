package kyu6;

//https://www.codewars.com/kata/554ca54ffa7d91b236000023/train/java

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnoughIsEnough {

    public static int[] deleteNth(int[] elements, int maxOccurrences) {

        Map<Integer, Integer> helperMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        if (maxOccurrences == 0) {
            return new int[0];
        }

        for (int element : elements) {

            if (!helperMap.containsKey(element)) {
                helperMap.put(element, 1);
                list.add(element);
                continue;
            }

            helperMap.put(element, helperMap.get(element) + 1);

            if (helperMap.get(element) <= maxOccurrences) {
                list.add(element);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();

    }

}
