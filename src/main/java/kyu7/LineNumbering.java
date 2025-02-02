package kyu7;

//https://www.codewars.com/kata/54bf85e3d5b56c7a05000cf9/train/java

import java.util.ArrayList;
import java.util.List;

public class LineNumbering {

    public static List<String> number(List<String> lines) {
        List<String> listToReturn = new ArrayList<>();
        int lineCounter = 1;

        for (String line : lines) {
            String stringToAdd = lineCounter + ": " + line;
            listToReturn.add(stringToAdd);
            lineCounter += 1;
        }

        return listToReturn;
    }

}
