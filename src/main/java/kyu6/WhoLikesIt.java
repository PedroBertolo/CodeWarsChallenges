package kyu6;

//https://www.codewars.com/kata/5266876b8f4bf2da9b000362/train/java

public class WhoLikesIt {

    public static String whoLikesIt(String... names) {

        StringBuilder stringBuilder = new StringBuilder();

        if (names.length == 0) {
            stringBuilder.append("no one likes this");
        } else if (names.length == 1) {
            stringBuilder.append(names[0]).append(" likes this");
        } else if (names.length == 2) {
            stringBuilder.append(names[0]).append(" and ").append(names[1]).append(" like this");
        } else if (names.length == 3) {
            stringBuilder.append(names[0]).append(", ").append(names[1]).append(" and ").append(names[2]).append(" like this");
        } else {
            stringBuilder.append(names[0]).append(", ").append(names[1]).append(" and ").append(names.length - 2).append(" others like this");
        }

        return stringBuilder.toString();
    }

}
