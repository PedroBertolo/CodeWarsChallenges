package kyu7;

//https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ShortestWord {

    public static int findShort(String s) {
        String[] words = s.split(" ");
        Arrays.sort(words, Comparator.comparingInt(String::length));
        return Arrays.stream(words).collect(Collectors.toList()).get(0).length();
    }
}
