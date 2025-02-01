package kyu6;

//https://www.codewars.com/kata/52c31f8e6605bcc646000082

import java.util.HashMap;

public class TwoSum {

    public static int[] twoSum(int[] numbers, int target) {
        // Solution 1: Big O Notation ->  O(n2)

//        int[] pairToReturn = null;
//        boolean pairFound = false;
//
//        for (int i = 0; i < numbers.length -1; i++) {
//            if (pairFound) break;
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[i] + numbers[j] == target) {
//                    pairToReturn = new int[]{i, j};
//                    pairFound = true;
//                    break;
//                }
//            }
//        }
//        return pairToReturn;

//        --------------------------------------------------------

        // Solution 2: Big O Notation ->  O(n) + O(n)
//        int[] pairToReturn = null;
//        HashMap<Integer, Integer> map = new HashMap<>();
//
//        for (int i = 0; i < numbers.length; i++) {
//            map.put(numbers[i], i);
//        }
//
//        for (int i = 0; i < numbers.length; i++) {
//            int keyToSearch = target - numbers[i];
//
//            if (map.containsKey(keyToSearch) && map.get(keyToSearch) != i) {
//                pairToReturn = new int[]{i, map.get(keyToSearch)};
//                break;
//            }
//        }
//        return pairToReturn;

        //        --------------------------------------------------------

        // Solution 3: Big O Notation ->  O(n)
        int[] pairToReturn = null;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int keyToSearch = target - numbers[i];

            if (map.containsKey(keyToSearch) && map.get(keyToSearch) != i) {
                pairToReturn = new int[]{i, map.get(keyToSearch)};
                break;
            }
            map.put(numbers[i], i);

        }
        return pairToReturn;
    }

}


//
//Map<Integer, Integer> numToIndexMapping = new HashMap<>(numbers.length);
//        for(int i = 0; i < numbers.length; i++) {
//        if(numToIndexMapping.containsKey(target - numbers[i])) {
//        return new int[] { i, numToIndexMapping.get(target - numbers[i]) };
//        } else {
//        numToIndexMapping.put(numbers[i], i);
//            }
//                    }
//                    return new int[0];
