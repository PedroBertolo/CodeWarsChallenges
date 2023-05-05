package kyu6;

//        Write simple .camelCase method for strings.
//        All words must have their first letter capitalized without spaces.
//        For instance:
//
//        camelCase("hello case"); // => "HelloCase"
//        camelCase("camel case word"); // => "CamelCaseWord"

import com.sun.deploy.util.StringUtils;

public class CamelCaseMethod {

    public static String camelCase(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String word : str.split(" ")) {
            if (word.isEmpty()) {
                continue;
            }
            String firstLetter = word.substring(0, 1).toUpperCase();
            stringBuilder.append(firstLetter).append(word.substring(1).toLowerCase());
        }
        return stringBuilder.toString();
    }
}
