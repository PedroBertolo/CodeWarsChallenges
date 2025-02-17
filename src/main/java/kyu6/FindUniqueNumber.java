package kyu6;

//https://www.codewars.com/kata/585d7d5adb20cf33cb000235/train/java

import java.util.*;
import java.util.stream.Collectors;

public class FindUniqueNumber {

    public static double findUniq(double arr[]) {

        ArrayList<Double> list = Arrays.stream(arr).boxed().collect(Collectors.toCollection(ArrayList::new));
        Set<Double> setOfDoubles = new HashSet<>();

        for (Double number : arr) {
            if (setOfDoubles.contains(number)) {
             list.removeIf(d -> d.equals(number));
            }
            setOfDoubles.add(number);
        }

        return list.get(0);
    }

}
