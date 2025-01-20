package kyu8;

//https://www.codewars.com/kata/54edbc7200b811e956000556/train

import java.util.Arrays;

public class SheepCounter {

    public static int countSheeps(Boolean[] arrayOfSheeps) {

        return (int) Arrays.stream(arrayOfSheeps)
                .filter(x -> {
                    if (x == null) return false;
                    return x;
                }).count();

    }
}
