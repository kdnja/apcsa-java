
/*
 * Activity 2.4.3
 */
import java.util.Scanner;

public class RemoveDoubleSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();

        // replaces all double spaces with single spaces using regex
        String output = input.replaceAll("\\s+", " ");
        // print output
        System.out.println(output);
        
    }
}