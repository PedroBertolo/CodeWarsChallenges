package kyu6;

//https://www.codewars.com/kata/5264d2b162488dc400000001/train/java

import org.apache.commons.lang3.StringUtils;

public class SpinWords {

    private final int MAX_WORD_LENGTH = 5;

    public String spinWords(String sentence) {

        String[] words = sentence.split(" ");
        StringBuilder toReturn = new StringBuilder();

        for (String word : words) {

            // Extrair prefixo e sufixo não alfabéticos
            String prefix = word.replaceAll("^[a-zA-Z]+", "");
            String core = word.replaceAll("^[^a-zA-Z]*|[^a-zA-Z]*$", "");
            String suffix = word.replaceAll("[a-zA-Z]+$", "");

            if (word.length() >= MAX_WORD_LENGTH) {
                toReturn.append(new StringBuilder(word).reverse().append(" "));
                continue;
            }

            toReturn.append(word).append(StringUtils.SPACE);
        }

        return toReturn.toString().trim();
    }

}
