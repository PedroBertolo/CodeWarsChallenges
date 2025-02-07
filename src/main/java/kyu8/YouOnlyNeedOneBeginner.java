package kyu8;

//https://www.codewars.com/kata/57cc975ed542d3148f00015b/train/java

import java.util.Arrays;
import java.util.stream.Collectors;

public class YouOnlyNeedOneBeginner {

    public static boolean check(Object[] a, Object x) {
        return Arrays.stream(a).collect(Collectors.toList()).contains(x);
    }

}
