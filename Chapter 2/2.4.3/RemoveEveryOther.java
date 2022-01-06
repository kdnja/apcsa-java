
/*
 * Activity 2.4.3
 */
import java.util.Scanner;

public class RemoveEveryOther {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            if (i % 2 == 0) {
                output += input.substring(i, i + 1);
            }
        }
        System.out.println(output);
    }
}