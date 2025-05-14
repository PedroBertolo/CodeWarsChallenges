package kyu7;

//https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java

import java.util.HashMap;
import java.util.Map;

public class XO {

    public static final String O_LOWERCASE = "o";
    public static final String O_UPPERCASE = "O";
    public static final String X_LOWERCASE = "x";
    public static final String X_UPPERCASE = "X";

    public static boolean getXO(String str) {

        Map<String, Integer> map = new HashMap<>();

        for (String word : str.split("")) {

            if (O_LOWERCASE.equals(word) || O_UPPERCASE.equals(word)) {

                if (map.containsKey(O_LOWERCASE)) {
                    map.put(O_LOWERCASE, map.get(O_LOWERCASE) + 1);
                    continue;
                }
                map.put(O_LOWERCASE, 1);
            }

            if (X_LOWERCASE.equals(word) || X_UPPERCASE.equals(word)) {

                if (map.containsKey(X_LOWERCASE)) {
                    map.put(X_LOWERCASE, map.get(X_LOWERCASE) + 1);
                    continue;
                }
                map.put(X_LOWERCASE, 1);
            }
        }

        if (map.isEmpty()) return true;
        if (!map.containsKey(X_LOWERCASE) || !map.containsKey(O_LOWERCASE)) return false;

        return map.get(X_LOWERCASE).intValue() == map.get(O_LOWERCASE).intValue();
    }
}
