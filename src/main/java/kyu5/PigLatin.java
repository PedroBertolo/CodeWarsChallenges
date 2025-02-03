package kyu5;

//https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java

public class PigLatin {

    public static String pigIt(String str) {

        if (str == null || str.isEmpty()) return "";

        StringBuilder stringBuilder = new StringBuilder();
        String ayStringToAdd = new String("ay");
        String[] strSplited = str.split(" ");

        for (String s : strSplited) {

            if (!Character.isAlphabetic(s.charAt(0))) {
                stringBuilder.append(s);
                continue;
            }

            String firstLetter = s.substring(0, 1);
            String wordWithoutFirstLetter = s.substring(1);
            stringBuilder.append(wordWithoutFirstLetter).append(firstLetter).append(ayStringToAdd).append(" ");
        }

        return stringBuilder.toString().trim();
    }

}
