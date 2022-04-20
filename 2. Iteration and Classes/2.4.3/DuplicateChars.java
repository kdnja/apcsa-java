
/*
 * Activity 2.4.3
 */
import java.util.Scanner;

public class DuplicateChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        String output = "";

        while (input.length() > 0) {
            String currChar = input.substring(0, 1);
            input = input.substring(1);
            if (input.indexOf(currChar) == 0) {
                output += currChar + currChar;
            }
        }

        System.out.println(output);
    }
}
