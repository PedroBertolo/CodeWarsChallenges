package kyu6;

//https://www.codewars.com/kata/58f5c63f1e26ecda7e000029/train/java

import java.util.ArrayList;
import java.util.List;

public class MexicanWave {

    public static String[] wave(String str) {

        if (str == null || str.isEmpty()) return new String[]{};

        List<String> toReturn = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (String.valueOf(str.charAt(i)).equals(" ")) continue;

            String letterToBeUpper = String.valueOf(str.charAt(i)).toUpperCase();
            stringBuilder.append(str, 0, i).append(letterToBeUpper).append(str.substring(i + 1));
            toReturn.add(stringBuilder.toString());
            stringBuilder.replace(0, stringBuilder.length(), "");
        }

        return toReturn.toArray(new String[0]);
    }

}
