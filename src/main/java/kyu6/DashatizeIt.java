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


public class DashatizeIt {

    public static String dashatize(int num) {
        String stringOfNum = num < 0 ? String.valueOf(num).substring(1) : String.valueOf(num);


        String[] split = String.valueOf(num).split("");


//         nFloors % 2 == 0 ? nFloors / 2 : nFloors / 2 + 1;

        return "";
    }

}
