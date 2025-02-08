package kyu7;

//https://www.codewars.com/kata/5a090c4e697598d0b9000004/train/java

import java.util.*;
import java.util.stream.Collectors;

public class MaxMinArrays {

    public static int[] solve(int[] arr) {

        if (arr == null || arr.length == 0) return new int[0];

        LinkedList<Integer> arrayListToReturn = new LinkedList<>();
        List<Integer> arrList = Arrays.stream(arr).boxed().collect(Collectors.toList());
        boolean isMaximum = true;

        while (!arrList.isEmpty()) {

            if (isMaximum) {
                Integer max = Collections.max(arrList);
                arrayListToReturn.add(max);
                arrList.remove(max);
                isMaximum = false;
                continue;
            }

            Integer min = Collections.min(arrList);
            arrayListToReturn.add(min);
            arrList.remove(min);
            isMaximum = true;
        }

        return arrayListToReturn.stream().mapToInt(i -> i).toArray();
    }

}
