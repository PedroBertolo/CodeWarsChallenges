package kyu6;
/*
Complete the solution so that the function will break up camel casing, using a space between words.
      Example:
      "camelCasing"  =>  "camel Casing"
      "identifier"   =>  "identifier"
      ""             =>  ""
*/

public class BreakCamelCase {
    public static String camelCase(String input) {
        String[] splittedInput = input.split("(?=[A-Z]+)");
        StringBuilder stringBuilder = new StringBuilder();

        int i = 0;
        for (String string : splittedInput) {
            if (string.isEmpty()){
                return stringBuilder.append("").toString();
            }

            if (i >= 1) {
                stringBuilder.append(" ").append(string);
            } else {
                stringBuilder.append(string);
            }
            i++;
        }

        return stringBuilder.toString().trim();
    }
}
