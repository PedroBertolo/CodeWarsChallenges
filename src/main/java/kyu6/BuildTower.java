package kyu6;


/* Build a pyramid-shaped tower,as an array/list of strings,given a positive integer number of floors.A tower block is represented with"*"character.

   For example,a tower with 3 floors looks like this:
        [
        "  *  ",
        " *** ",
        "*****"
        ]
   And a tower with 6 floors looks like this:

        [
        "     *     ",
        "    ***    ",
        "   *****   ",
        "  *******  ",
        " ********* ",
        "***********"
        ]
*/

import java.util.ArrayList;
import java.util.List;

public class BuildTower {

    //fixme
    public static List<String> towerBuilder(int nFloors) {
        List<String> listOfFloors = new ArrayList<>();

        int middleNumber = nFloors % 2 == 0 ? nFloors / 2 : nFloors / 2 + 1;

        listOfFloors.add("*");


        return listOfFloors;
    }
}
