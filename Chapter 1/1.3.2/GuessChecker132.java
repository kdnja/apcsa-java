
/*
 * Activity 1.3.2
 */

import java.util.Scanner;

public class GuessChecker132 {
  public static void main(String[] args) {
    /* Add any variables you will need throughout the program here. */

    // Generate the random number
    String targetStr = makeCode();
    // System.out.println(targetStr); // uncomment for debugging

    // Break the random number into four variables.
    int r1 = Integer.parseInt(targetStr.substring(0, 1));
    int r2 = Integer.parseInt(targetStr.substring(1, 2));
    int r3 = Integer.parseInt(targetStr.substring(2, 3));
    int r4 = Integer.parseInt(targetStr.substring(3, 4));

    // Get the user's guess.
    String guess = getGuess();
    // System.out.println(guess); // uncomment for debugging

    // Break the user's guess into four variables.
    int g1 = Integer.parseInt(guess.substring(0, 1));
    int g2 = Integer.parseInt(guess.substring(1, 2));
    int g3 = Integer.parseInt(guess.substring(2, 3));
    int g4 = Integer.parseInt(guess.substring(3, 4));

    // My code

    int hit = 0;

    if (g1 == r1) {
      System.out.println("Your first digit was correct");
      hit += 1;
    }
    if (g2 == r2) {
      System.out.println("Your second digit was correct");
      hit += 1;
    }
    if (g3 == r3) {
      System.out.println("Your third digit was correct");
      hit += 1;
    }
    if (g4 == r4) {
      System.out.println("Your fourth digit was correct");
      hit += 1;
    }
    System.out.println("Total correct: " + hit);
  }

  // Checks to ensure no duplicate digits in a int.
  public static boolean hasDupes(int num) {
    boolean[] digs = new boolean[10];
    while (num > 0) {
      if (digs[num % 10])
        return true;
      digs[num % 10] = true;
      num /= 10;
    }
    return false;
  }

  // Creates a new random 4 digit code 1000-9999 with no duplicates.
  public static String makeCode() {
    int target = (int) (Math.random() * 9000 + 1000);
    while (hasDupes(target))
      target = (int) (Math.random() * 9000 + 1000);
    String targetStr = target + "";
    return targetStr;
  }

  // Prompts the user for a guess and repeats until valid guess is made.
  public static String getGuess() {
    Scanner sc = new Scanner(System.in);
    boolean validGuess = false;
    int userGuess = 0;
    while (!validGuess) {
      System.out.print("Guess a 4-digit number from 1000 to 9999 with no duplicate digits: ");
      userGuess = sc.nextInt();
      if (!(hasDupes(userGuess) || (userGuess < 1000)))
        validGuess = true;
    }
    String userStr = userGuess + "";
    return userStr;
  }
}
