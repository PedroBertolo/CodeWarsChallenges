package kyu7;

//https://www.codewars.com/kata/563b662a59afc2b5120000c6/train/java

public class GrowthOfPopulation {

    public static int nbYear(int p0, double percent, int aug, int p) {
        boolean hasReachedPopulation = false;
        int numberOfYearsToReachPop = 0;

        double percentInNumber = percent / 100.0;

        while (!hasReachedPopulation) {
            p0 = (int) (p0 + (p0 * percentInNumber) + aug);
            numberOfYearsToReachPop++;

            if (p0 >= p) hasReachedPopulation = true;
        }

        return numberOfYearsToReachPop;
    }

}
