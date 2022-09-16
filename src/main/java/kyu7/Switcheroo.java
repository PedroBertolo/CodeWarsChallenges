package kyu7;

/*
Given a string made up of letters a, b, and/or c, switch the position of letters a and b (change a to b and vice versa). Leave any incidence of c untouched.

    Example:
    'acb' --> 'bca'
    'aabacbaa' --> 'bbabcabb'
 */

public class Switcheroo {
    public static String switcheroo(String x) {
        String[] splittedString = x.split("");
        StringBuilder stringBuilder = new StringBuilder();

        for (String string : splittedString) {
            if (string.equals("a")) {
                stringBuilder.append("b");
            } else if (string.equals("b")) {
                stringBuilder.append("a");
            } else {
                stringBuilder.append("c");
            }
        }
        return stringBuilder.toString();
    }
}
