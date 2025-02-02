package kyu7;

//https://www.codewars.com/kata/529eef7a9194e0cbc1000255/train/java

import java.util.Arrays;
import java.util.stream.Collectors;

public class AnagramDetection {

    public static boolean isAnagram(String a, String b) {
        String[] aSplit = a.toLowerCase().split("");
        String[] bSplit = b.toLowerCase().split("");
        return Arrays.stream(aSplit).sorted().collect(Collectors.joining()).equals(Arrays.stream(bSplit).sorted().collect(Collectors.joining()));
    }

}
