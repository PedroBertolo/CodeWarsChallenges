package kyu6;

//  Complete the solution so that it splits the string into pairs of two characters.
//  If the string contains an odd number of characters then it should replace the missing second character of the final pair with an underscore ('_').
//
//   Examples:
//        * 'abc' =>  ['ab', 'c_']
//        * 'abcdef' => ['ab', 'cd', 'ef']

import java.util.ArrayList;

public class StringSplit {

    public static String[] solution(String s) {
        ArrayList<String> arrayList = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();

        boolean isEven = s.split("").length % 2 == 0;

        for (int i = 0; i < s.length(); i += 2) {
            if (!isEven && i + 1 == s.length()) {
                arrayList.add(stringBuilder.append(s.substring(i)).append("_").toString());
                break;
            }
            arrayList.add(s.substring(i, i + 2));
        }

        String[] stringArray = arrayList.toArray(new String[arrayList.size()]);
        return stringArray;
    }
}
