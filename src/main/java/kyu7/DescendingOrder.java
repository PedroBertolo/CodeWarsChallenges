package kyu7;

//https://www.codewars.com/kata/5467e4d82edf8bbf40000155/train/java

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrder {

    public static int sortDesc(final int num) {

        StringBuilder stringBuilder = new StringBuilder();
        List<String> collect = Arrays.stream(String.valueOf(num).split("")).sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        for (String string : collect) {
            stringBuilder.append(string);
        }

        return Integer.parseInt(stringBuilder.toString());
    }
}
