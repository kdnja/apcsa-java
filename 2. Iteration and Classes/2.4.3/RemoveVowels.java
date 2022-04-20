
/*
 * Activity 2.4.3
 */
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            String substr = input.substring(i, i + 1);
            if (!(substr.equals("a") || substr.equals("e") || substr.equals("i") || substr.equals("o")
                    || substr.equals("u") || substr.equals("A") || substr.equals("E") || substr.equals("I")
                    || substr.equals("O") || substr.equals("U"))) {
                output += substr;
            }
        }

        System.out.println(output);
    }
}