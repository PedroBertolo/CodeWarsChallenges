package kyu7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Implement a function that accepts 3 integer values a, b, c. The function should return true if a triangle can be built with the sides of given length and false in any other case.

(In this case, all triangles must have surface greater than 0 to be accepted).
 */

//Triangle Inequality Theorem
public class IsThisATriangle {
    public static boolean isTriangle(int a, int b, int c) {
        List<Integer> listOfNumbers = new ArrayList<>();
        listOfNumbers.add(a);
        listOfNumbers.add(b);
        listOfNumbers.add(c);
        Collections.sort(listOfNumbers);

        int hipotenusa = listOfNumbers.get(listOfNumbers.size() - 1);

        return listOfNumbers.get(0) + listOfNumbers.get(1) > hipotenusa;
    }
}
