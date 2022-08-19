package kyu8;

/*
    Create a function that gives a personalized greeting. This function takes two parameters: name and owner.

    Use conditionals to return the proper message:
    name equals owner -> 'Hello boss'
    otherwisΩ -> 'Hello guest'
 */

public class GrasshopperPersonalizedMessage {
    public static String greet(String name, String owner) {
        if (name.equals(owner)) {
            return "Hello boss";
        } else {
            return "Hello guest";
        }
    }
}
