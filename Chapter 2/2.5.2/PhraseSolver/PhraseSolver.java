
/*
 * Activity 2.5.2
 *
 *  The PhraseSolver class the PhraseSolverGame
 */
import java.util.Scanner;

public class PhraseSolver {
    /* attributes */

    private Player player1;
    private Player player2;
    private Board game;

    /* constructor(s) */

    public PhraseSolver() {
        player1 = new Player(); // first player
        player2 = new Player(); // second player
        game = new Board();
    }

    public void play() {
        boolean solved = false;
        boolean correct = true;
        
        int currentPlayer = 1;
        Scanner input = new Scanner(System.in);

        while (!solved) {
            /* your code here - game logic */

            System.out.println("Phrase: " + game.getPhrase());
            System.out.println("Phrase to solve for: " + game.getSolvedPhrase());

            if (currentPlayer == 1) {
                System.out.println(player1.getName() + ", what is your guess?");
            } else {
                System.out.println(player2.getName() + ", what is your guess?");
            }

            String guess = input.nextLine();

            if (guess.length() == 1) {
                correct = game.guessLetter(guess);
                if (correct == true) {
                    System.out.println("\n\"" + guess + "\" was in the phrase.");
                } else {
                    System.out.println("\nDarn, \"" + guess + "\" wasn't in the phrase.");
                    if (currentPlayer == 1) {
                        currentPlayer = 2;
                    } else {
                        currentPlayer = 1;
                    }
                }
            } else {
                solved = game.isSolved(guess);
                if (solved == true) {
                    if (currentPlayer == 1) {
                        System.out.println("\nCongratulations, " + player1.getName() + ", you won!");
                    } else {
                        System.out.println("\nCongratulations, " + player2.getName() + ", you won!");
                    }
                } else {
                    if (currentPlayer == 1) {
                        currentPlayer = 2;
                    } else {
                        currentPlayer = 1;
                    }
                    System.out.println("\nThat wasn't right...");
                }
            }
        }
        input.close();
    }
}
