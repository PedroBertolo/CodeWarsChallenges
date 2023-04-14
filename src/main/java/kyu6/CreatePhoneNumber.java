package kyu6;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
    Write a function that accepts an array of 10 integers (between 0 and 9), that returns a string of those numbers in the form of a phone number.

    Example
    Kata.createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}) // => returns "(123) 456-7890"

    The returned format must be correct in order to complete this challenge.
    Don't forget the space after the closing parentheses!
 */
public class CreatePhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");

        List<Integer> list = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.toList());

        list.stream()
                .limit(3)
                .collect(Collectors.toList())
                .stream()
                .forEach(x -> {
                    stringBuilder.append(x);
                    list.remove(x);
                });

        stringBuilder.append(") ");

        list.stream()
                .limit(3)
                .collect(Collectors.toList())
                .stream()
                .forEach(x -> {
                    stringBuilder.append(x);
                    list.remove(x);
                });

        stringBuilder.append("-");

        list.stream()
                .forEach(x -> stringBuilder.append(x));

        return stringBuilder.toString();
    }

}
