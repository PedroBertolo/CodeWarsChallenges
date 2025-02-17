package kyu6;

//https://www.codewars.com/kata/576757b1df89ecf5bd00073b/train/java

//import com.sun.tools.javac.util.StringUtils;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BuildTower {

    public static final String ASTERISK = "*";
    public static final String EMPTY_SPACE = " ";

    public static String[] towerBuilder(int nFloors) {
        List<String> listOfFloors = new ArrayList<>();

        int numberOfAsterisks = (nFloors * 2) - 1;
        int numberOfEmptySpaces = 0;

        while (numberOfAsterisks >= 1) {
            StringBuilder stringBuilder = new StringBuilder();
//            spaces before
            if (numberOfEmptySpaces > 0) {
                for (int i = 0; i < numberOfEmptySpaces / 2; i++) {
                    stringBuilder.append(EMPTY_SPACE);
                }
            }
//            asterisks
            for (int i = 0; i < numberOfAsterisks; i++) {
                stringBuilder.append(ASTERISK);
            }
//            spaces after
            if (numberOfEmptySpaces > 0) {
                for (int i = 0; i < numberOfEmptySpaces / 2; i++) {
                    stringBuilder.append(EMPTY_SPACE);
                }
            }

            listOfFloors.add(stringBuilder.toString());
            numberOfAsterisks -= 2;
            numberOfEmptySpaces += 2;
        }

        Collections.reverse(listOfFloors);
        return listOfFloors.toArray(new String[0]);
    }
}
