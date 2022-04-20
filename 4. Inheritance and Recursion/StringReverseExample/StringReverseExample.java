/*
 * Activity 4.10.1
 */
public class StringReverseExample {
    public static void main(String args[]) {
        String str = "abcdefgh";
        // recursive method to reverse String in Java
        System.out.println("Reverse String in Java using Recursion: " + reverseRecursively(str));
        // System.out.println("Reverse String in Java using iteration: " + reverse(str));
    }

    /**
     * Reverse a string using recursion
     */
    public static String reverseRecursively(String str) {
        // base case to handle string with one char and return
        if (str.length() == 1) {
            return str.substring(0);
        }
        // recurse with char at beginning removed
        return reverseRecursively(str.substring(1)) + str.substring(0, 1);
    }

    /**
     * Reverse a string using iteration
     */
    public static String reverse(String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }
}
