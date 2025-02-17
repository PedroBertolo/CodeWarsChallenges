package kyu6;

//https://www.codewars.com/kata/57eb8fcdf670e99d9b000272/train/java

public class HighestScoringWord {

    private static char A = 'a';

    public static String high(String s) {

        String[] words = s.toLowerCase().split(" ");
        int toReturn = 0;
        String wordToReturn = "";

        for (String word : words) {

            String[] letters = word.split("");
            int sum = 0;

            for (String letter : letters) {
                if (letter != null && !letter.isEmpty()) {
                    sum += calculatePositionInAlphabet(letter);
                }
            }

            if (sum > toReturn) {
                toReturn = sum;
                wordToReturn = word;
            }
        }

        return wordToReturn;
    }

    private static int calculatePositionInAlphabet(String letter) {
        return (letter.charAt(0) - A) + 1;
    }

}
