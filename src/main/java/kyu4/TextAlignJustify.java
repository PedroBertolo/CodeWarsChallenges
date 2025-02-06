package kyu4;

//https://www.codewars.com/kata/537e18b6147aa838f600001b/train/java

import java.util.*;
import java.util.stream.Collectors;

public class TextAlignJustify {

    private static final String NEW_LINE_SEPARATOR = "\n";
    private static final String SPACE_SEPARATOR = " ";
    private static final String EMPTY_STRING = "";

    public static String justify(String text, int width) {
        if (text == null || text.isEmpty()) return "";

        List<String> listOfLines = new LinkedList<>();
        StringBuilder stringBuilder = new StringBuilder();

        String[] words = text.split(" ");
        int spacesLeftToFill = width;

        for (String word : words) {

            if (word.length() <= spacesLeftToFill) {
                stringBuilder.append(word);
                stringBuilder.append(SPACE_SEPARATOR);
                spacesLeftToFill -= word.length() + SPACE_SEPARATOR.length();
                continue;
            }

            // case if line does not has the width required
            if (stringBuilder.toString().trim().length() != width) {
                ArrayList<String> wordsToPutSpace = Arrays.stream(stringBuilder.toString().trim().split(" ")).collect(Collectors.toCollection(ArrayList::new));

                // case there are more than 1 word in line (last word to add later, after adding spaces)
                String lastWord = "";
                if (wordsToPutSpace.size() > 1) {
                    lastWord = wordsToPutSpace.get(wordsToPutSpace.size() - 1);
                    wordsToPutSpace.remove(wordsToPutSpace.size() - 1);
                    spacesLeftToFill = width - stringBuilder.toString().trim().length();
                    int counterToList = 0;

                    while (spacesLeftToFill != 0) {
                        wordsToPutSpace.set(counterToList, wordsToPutSpace.get(counterToList).concat(SPACE_SEPARATOR));
                        counterToList++;

                        if (counterToList == wordsToPutSpace.size()) {
                            counterToList = 0;
                        }

                        spacesLeftToFill--;
                    }

                    wordsToPutSpace.add(wordsToPutSpace.size(), lastWord);
                }

                // case there is just 1 word in line
                String join = String.join(" ", wordsToPutSpace).concat(NEW_LINE_SEPARATOR);
                listOfLines.add(join);

                // case if line has the width required
            } else {
                listOfLines.add(stringBuilder.toString().trim().concat(NEW_LINE_SEPARATOR));
            }

            spacesLeftToFill = width;
            stringBuilder.replace(0, stringBuilder.length(), "");
            stringBuilder.append(word);
            stringBuilder.append(SPACE_SEPARATOR);
            spacesLeftToFill -= stringBuilder.toString().length();
        }

        if (!EMPTY_STRING.contentEquals(stringBuilder)) {
            listOfLines.add(listOfLines.size(), stringBuilder.toString().trim());
        }

        return String.join("", listOfLines);
    }

}
