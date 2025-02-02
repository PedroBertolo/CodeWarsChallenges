package kyu6;

//https://www.codewars.com/kata/597770e98b4b340e5b000071/train/java

public class FileNameExtractor {

    public static String extractFileName(String dirtyFileName) {
        String stringWithoutFirstWord = dirtyFileName.substring(dirtyFileName.indexOf("_") + 1);
        String[] splitted = stringWithoutFirstWord.split("\\.");
        return new StringBuilder(splitted[0]).append(".").append(splitted[1]).toString();
    }

}

