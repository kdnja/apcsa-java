
/*
 * Activity 1.3.6
 */
import java.util.Scanner;

public class DeMorgansLaw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 'true' or 'false' for A");
        boolean a = Boolean.parseBoolean(sc.nextLine());

        System.out.println("Enter 'true' or 'false' for B");
        boolean b = Boolean.parseBoolean(sc.nextLine());

        /* your code here */
        System.out.println("\nFirst law\n");
        if (!(a && b) == true) {
            System.out.println("Not (a and b) is true");
        } else {
            System.out.println("Not (a and b) is false");
        }
        if (!a || !b == true) {
            System.out.println("(not a) or (not b) is true");
        } else {
            System.out.println("(not a) or (not b) is false");
        }
        System.out.println("\n");
    }
}
