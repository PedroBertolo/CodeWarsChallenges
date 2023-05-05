package kyu6;

/*
Given a variable n,

If n is an integer, Return a string with dash'-'marks before and after each odd integer, but do not begin or end the string with a dash mark.
If n is negative, then the negative sign should be removed.
If n is not an integer, return an empty value.

        Ex:
        dashatize(274) -> '2-7-4'
        dashatize(6815) -> '68-1-5'
*/


import java.util.ArrayList;
import java.util.List;

public class DashatizeIt {

    public static String dashatize(int num) {
        String stringOfNum = num < 0 ? String.valueOf(num).substring(1) : String.valueOf(num);
        String[] splitNum = stringOfNum.split("");
        StringBuilder stringBuilder = new StringBuilder();

        for (String number : splitNum) {
            if (Integer.valueOf(number).intValue() % 2 != 0) {
                stringBuilder.append("-").append(number).append("-");
            } else {
                stringBuilder.append(number);
            }
        }

        String toReturn = stringBuilder.toString();
        String[] split = stringBuilder.toString().split("");

        if (split[0].equals("-")) {
            toReturn = toReturn.substring(1);
        }
        if (split[split.length - 1].equals("-")) {
            toReturn = toReturn.substring(0, toReturn.length() - 1);
        }

        List<String> splittedString = new ArrayList<>();
        for (String string : toReturn.split("")) {
            splittedString.add(string);
        }

        for (int i = 0; i < splittedString.size() - 1; i++) {
            if (splittedString.get(i).equals("-") && splittedString.get(i).equals(splittedString.get(i + 1))) {
                splittedString.remove(i);
            }
        }

        return String.join("", splittedString);
    }

}
