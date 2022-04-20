
/*
 * Activity 1.3.5
 */
import java.util.Scanner;

public class CompoundBoolean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the second number");
        int b = Integer.parseInt(sc.nextLine());

        /* my code */
        System.out.println("Enter the third number");
        int c = Integer.parseInt(sc.nextLine());

        if ((a > b) && (b > c)) {
            System.out.println("(a > b) and (b > c) is true");
        } else if ((a > b) || (b > c)) {
            System.out.println("(a > b) or (b > c) is true");
        } else if (!((a > b) && (b > c))) {
            System.out.println("Not (a > b) or (b > c) is true");
        } else {
            System.out.println("This should not show");
        }
    }
}
