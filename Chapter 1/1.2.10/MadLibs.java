import java.util.Scanner;

public class MadLibs {
  public static void main(String[] args) {
    // creates a scanner to process terminal input
    Scanner sc = new Scanner(System.in);

    // prompts the user so they know when
    // to enter keyboard input within a program
    System.out.println("Enter a verb: ");
    String verb = sc.nextLine();
    System.out.println("Enter a noun: ");
    String noun = sc.nextLine();
    System.out.println("Enter an adjective: ");
    String adj = sc.nextLine();
    // after collecting input, you can treat user input
    // as a normal String value
    System.out.println(verb + noun + adj);
  }
}
