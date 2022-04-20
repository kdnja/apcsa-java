
/*
 * Activity 2.4.3
 */

import java.util.Scanner;
import java.lang.Math;

public class Dyslexia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input = sc.nextLine();
        String output = "";

        for (int i = 0; i < input.length(); i++) {
            String x = input.substring(i, i + 1);
            if (x.equals("p") || x.equals("b") || x.equals("d") || x.equals("q")) {
                int random = (int) (Math.random() * 4);
                if (random == 0) {
                    output += 'p';
                } else if (random == 1) {
                    output += 'b';
                } else if (random == 2) {
                    output += 'd';
                } else {
                    output += 'q';
                }
            } else {
                output += x;
            }
        }

        System.out.println(output);
    }
}
