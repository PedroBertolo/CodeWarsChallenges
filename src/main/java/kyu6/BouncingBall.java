package kyu6;

//https://www.codewars.com/kata/5544c7a5cb454edb3c000047/train/java

public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        //always see when the ball is falling
        int countToReturn = 1;

        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) return -1;

        double bounceHeight = h * bounce;

        while (bounceHeight > window) {
            countToReturn += 2;
            bounceHeight = bounceHeight * bounce;
        }

        return countToReturn ;
    }

}
