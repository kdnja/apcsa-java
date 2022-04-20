/*

Name: Choose Your Path
Author: Caden Jamason
Date: 01/09/2021
Course: AP CSA 1

Description: This allows the user to choose their own adventure with provided storyline and paths.
Preconditions: User needs to enter their choices
Postconditions: The code prints out the consequences of their choices

*/

import java.util.Scanner;

public class ChooseYourPath {
    
    Scanner stringReader = new Scanner(System.in);

    public ChooseYourPath() {

        // Beginning
        System.out.println("You're walking down a dark corridor.");
        System.out.println("You see a torch in front of you.");
        System.out.println("Take it?");
        System.out.println("\nEnter 'yes' or 'no':");

        // Choices: Yes or No
        String choice = stringReader.nextLine();

        // Torch choice: Yes
        // Continue
        if (choice.toLowerCase().equals("yes")) {
            System.out.println("\nThe floor in front of you brightens with the torch's glow.");
            System.out.println("You see three paths: the left, the right, and the middle.");
            System.out.println("Go left, middle, or right?");
            System.out.println("\nEnter 'left', 'middle', or 'right':");

            // Choices: Left, Middle, Right
            String hallwayChoice = stringReader.nextLine();

            // Hallway choice: Right
            // Continue
            if (hallwayChoice.toLowerCase().equals("right")) {
                System.out.println("\nYou continue down the rightmost path.");
                System.out.println("The hallway widens into a room with a large gap and a door at the end.");
                System.out.println("There are two platforms that you can jump onto.");
                System.out.println("Jump on the left platform or right platform?");
                System.out.println("\nEnter 'left' or 'right':");

                // Choices: Left or Right
                String platformChoice1 = stringReader.nextLine();

                // Platform choice #1: Left
                // Continue
                if (platformChoice1.toLowerCase().equals("left")) {
                    System.out.println("\nYou jump onto the left platform.");
                    System.out.println("The platform wobbles, but steadies after a second.");
                    System.out.println("After regaining your balance, you see another pair of platforms.");
                    System.out.println("Jump on the left platform or right platform?");
                    System.out.println("\nEnter 'left' or 'right':");

                    // Choices: Left or Right
                    String platformChoice2 = stringReader.nextLine();

                    // Platform choice #2: Right
                    // Continue
                    if (platformChoice2.toLowerCase().equals("right")) {
                        System.out.println("\nYou jump onto the right platform.");
                        System.out.println("The platform wobbles, but steadies after a second.");
                        System.out.println("In front of you, there is one last pair of platforms.");
                        System.out.println("Jump on the left platform or right platform?");
                        System.out.println("\nEnter 'left' or 'right':");

                        String platformChoice3 = stringReader.nextLine();

                        // Platform choice #3: Right
                        // Continue
                        if (platformChoice3.toLowerCase().equals("right")) {
                            System.out.println("\nYou jump onto the right platform.");
                            System.out.println("The platform wobbles, but steadies after a second.");
                            System.out.println("You cross the gap and make it to the other side.");
                            System.out.println("You make it out of the corridors.");
                        }

                        // Platform choice #3: Left
                        // Game Over
                        if (platformChoice3.toLowerCase().equals("left")) {
                            System.out.println("\nYou jump onto the left platform.");
                            System.out.println(
                                    "The platform crumbles under your weight, plunging you into the deep dark abyss below.");
                        }
                    }

                    // Platform choice #2: Left
                    // Game Over
                    if (platformChoice2.toLowerCase().equals("left")) {
                        System.out.println("\nYou jump onto the left platform.");
                        System.out.println(
                                "The platform crumbles under your weight, plunging you into the deep dark abyss below.");
                    }
                }

                // Platform choice #1: Right
                // Game Over
                if (platformChoice1.toLowerCase().equals("right")) {
                    System.out.println("\nYou jump onto the right platform.");
                    System.out.println(
                            "The platform crumbles under your weight, plunging you into the deep dark abyss below.");
                }
            }

            // Hallway choice: Middle
            // Game Over
            else if (hallwayChoice.toLowerCase().equals("middle")) {
                System.out.println("\nYou head down the path in the middle.");
                System.out.println("You keep walking for what seems like ages.");
                System.out.println("Scared and confused, you walk backwards to where the paths were.\n");
                System.out.println("You find yourself face-to-face with a door closed shut.");
                System.out.println("You are trapped with no way to get out.");
            }

            // Hallway choice: Left
            // Game Over
            else if (hallwayChoice.toLowerCase().equals("left")) {
                System.out.println("\nYou bump into a wall as you head left.");
                System.out.println("You drop your torch and it extinguishes itself.");
                System.out.println("With no light to see, you become lost in the maze of corridors.");
            }
        }

        // Torch choice: No
        // Game Over
        if (choice.toLowerCase().equals("no")) {
            System.out.println("\nYou keep going down the hallway blind.");
            System.out.println("You become lost in the maze of corridors.");
        }
    }
    
    public static void main(String[] args) {
        new ChooseYourPath();
    }
}