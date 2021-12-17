
/*
 * Activity 1.3.6
 */
import java.util.Scanner;

public class DeMorgansLawIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 'true' or 'false' for A");
        boolean a = Boolean.parseBoolean(sc.nextLine());

        System.out.println("Enter 'true' or 'false' for B");
        boolean b = Boolean.parseBoolean(sc.nextLine());

        if (!(a && b)) {
            System.out.println("NOT (a AND b) evaluates to true");
        } else {
            System.out.println("NOT (a AND b) evaluates to false");
        }

        /* your code here */
        if (!a) {
            System.out.println("NOT (a AND b) evaluates to true");
        } else {
            if (!b) {
                System.out.println("NOT (a AND b) evaluates to true");
            } else {
                System.out.println("NOT (a AND b) evaluates to false");
            }
        }

        if (!(a || b)) {
            System.out.println("NOT (a OR b) evaluates to true");
        } else {
            System.out.println("NOT (a OR b) evaluates to false");
        }
        /* your code here */
        if (!a) {
            if (!b) {
                System.out.println("NOT (a OR b) evaluates to true");
            } else {
                System.out.println("NOT (a OR b) evaluates to false");
            }
        } else {
            System.out.println("NOT (a OR b) evaluates to false");
        }
    }
}
