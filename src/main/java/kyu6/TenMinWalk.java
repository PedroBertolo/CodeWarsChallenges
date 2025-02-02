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
                    yPosition++;
                    break;
                case 's':
                    yPosition--;
                    break;
                case 'e':
                    xPosition++;
                    break;
                case 'w':
                    xPosition--;
                    break;
                default:
                    System.out.println("Skipping, doesn't move...");
                    break;
            }
        }
        return xPosition == 0 && yPosition == 0;
    }

}
