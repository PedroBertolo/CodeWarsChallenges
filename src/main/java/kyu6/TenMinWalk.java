package kyu6;

// https://www.codewars.com/kata/54da539698b8a2ad76000228/train

public class TenMinWalk {

    public static boolean isValid(char[] walk) {
        //walk needs to be exact 10min
        if (walk.length != 10) return false;

        int yPosition = 0;
        int xPosition = 0;

        for (char c : walk) {
            switch (c) {
                case 'n':
                    yPosition = yPosition + 1;
                    break;
                case 's':
                    yPosition = yPosition - 1;
                    break;
                case 'e':
                    xPosition = xPosition + 1;
                    break;
                case 'w':
                    xPosition = xPosition - 1;
                    break;
                default:
                    System.out.println("Skipping, doesn't move...");
                    break;
            }
        }
        return xPosition == 0 && yPosition == 0;
    }

}
