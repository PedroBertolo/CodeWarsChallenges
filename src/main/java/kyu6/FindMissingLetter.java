package kyu6;

/*
Write a method that takes an array of consecutive (increasing) letters as input and that returns the missing letter in the array.
You will always get an valid array. And it will be always exactly one letter be missing. The length of the array will always be at least 2.
The array will always contain letters in only one case.

Example:
['a','b','c','d','f'] -> 'e'
['O','Q','R','S'] -> 'P'
(Use the English alphabet with 26 letters!)
*/

public class FindMissingLetter {

    public static char findMissingLetter(char[] array) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int positionOfEqualLetter = 0;
        char missingLetter = 0;
        boolean isCapsLock = String.valueOf(array[0]).equals(String.valueOf(array[0]).toUpperCase()) ? true : false;

        FIRST_LOOP:
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; i < alphabet.length; j++) {
                if (array[i] == alphabet[j] || String.valueOf(array[i]).toLowerCase().equals(String.valueOf(alphabet[j]))) {
                    positionOfEqualLetter = j;
                    break FIRST_LOOP;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (!String.valueOf(array[i]).toLowerCase().equals(String.valueOf(alphabet[positionOfEqualLetter]))) {
                missingLetter = isCapsLock ? String.valueOf(alphabet[positionOfEqualLetter]).toUpperCase().charAt(0) : alphabet[positionOfEqualLetter];
                break;
            }
            positionOfEqualLetter++;
        }

        return missingLetter;
    }
}
