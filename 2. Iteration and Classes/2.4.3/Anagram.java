
/*
 * Activity 2.4.3
 */
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string one: ");
        String str1 = sc.nextLine();
        System.out.println("Enter string two: ");
        String str2 = sc.nextLine();

        boolean anagram = true;

        while (anagram && str1.length() > 0 && str2.length() > 0) {
            // get first letter in str1
            String c = str1.substring(0, 1);
            // skip spaces
            if (!c.equals(" ")) {
                // find letter in str2
                int start = str2.indexOf(c);
                if (start >= 0) {
                    // remove letter from str2
                    str2 = str2.substring(0, start) + str2.substring(start + 1);
                } else {
                    anagram = false;
                }
            }
            // remove letter from str1
            str1 = str1.substring(1);
        }
        // remove spaces that were skipped in str2 (can also use String method)
        while (str2.indexOf(" ") == 0) {
            str2 = str2.substring(1);
        }
        // left over letters mean no anagram
        if (str1.length() > 0 || str2.length() > 0) {
            anagram = false;
        }
        System.out.println("Is anagram: " + anagram);
    }
}