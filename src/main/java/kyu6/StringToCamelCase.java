package kyu6;

//https://www.codewars.com/kata/517abf86da9663f1d2000003/train/java

public class StringToCamelCase {

    public static String toCamelCase(String s) {

        char[] letters = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        boolean IsUppercase = false;

        for (char letter : letters) {

            if (Character.isAlphabetic(letter)) {

                if (IsUppercase) {
                    stringBuilder.append(Character.toString(letter).toUpperCase());
                    IsUppercase = false;
                    continue;
                }

                stringBuilder.append(letter);
                continue;
            }

            IsUppercase = true;
        }

        return stringBuilder.toString();
    }

}
