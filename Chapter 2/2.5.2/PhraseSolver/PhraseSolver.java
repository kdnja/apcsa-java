
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
    private boolean solved;

    /* constructor(s) */

    public PhraseSolver() {
        player1 = new Player(); // first player
        player2 = new Player(); // second player
        game = new Board();
        solved = false; // state of the game
    }

    /* accessor(s) */

    /* mutator(s) */

    public void play() {
        boolean solved = false;
        int currentPlayer = 1;

        Scanner input = new Scanner(System.in);

        boolean correct = true;
        while (!solved) {
            /* your code here - game logic */

            // TODO: set the current player to Player 1

            // TODO: prompt the current player for a guess

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
            } else {
                solved = game.isSolved(guess);
            }

            // TODO: stop the game if the phrase is solved

            // TODO: switch players if the guess is incorrect

            /* your code here - determine how game ends */
            solved = true;
        }
    }
}