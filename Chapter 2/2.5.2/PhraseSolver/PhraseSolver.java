
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
        solved = false;
    }

    public void play() {
        boolean correct = true;

        Player activePlayer = player1;

        int currentPlayer = 1;
        Scanner input = new Scanner(System.in);

        while (!solved) {

            // display current solved phrase
            System.out.println("Phrase: " + game.getSolvedPhrase());

            // sets the letter value
            game.setLetterValue();
            // display current letter value
            System.out.println("Letter value: " + game.getLetterValue());

            // prompt guess from current player
            System.out.println(activePlayer.getName() + ", what is your guess?");
            // get guess from current player
            String guess = input.nextLine();

            // check if the guess is one character
            if (guess.length() == 1) {
                // stores guess result in boolean variable `correct`
                correct = game.guessLetter(guess);
                // if true, print out result
                if (correct == true) {
                    System.out.println("\n\"" + guess + "\" was in the phrase.");
                    activePlayer.addToPoints(game.getLetterValue());
                }
                // if false, print out result and switch characters
                else {
                    System.out.println("\nDarn, \"" + guess + "\" wasn't in the phrase.");
                    // switch players
                    if (currentPlayer == 1) {
                        currentPlayer = 2;
                        activePlayer = player2;
                    } else {
                        currentPlayer = 1;
                        activePlayer = player1;
                    }
                }
            }
            // else statement for guesses more than 1 character
            else {
                // store result in boolean variable `solved`
                solved = game.isSolved(guess);
                // if true, print out celebration with the active player's name
                if (solved == true) {
                    System.out.println("\nCongratulations, " + activePlayer.getName() + ", you solved the phrase!\n");
                }
                // if false, print out result and switch players
                else {
                    System.out.println("\nThat wasn't right...");
                    if (currentPlayer == 1) {
                        currentPlayer = 2;
                        activePlayer = player2;
                    } else {
                        currentPlayer = 1;
                        activePlayer = player1;
                    }
                }
            }
        }
        // displays score of both players
        System.out.println(player1.getName() + "'s score: " + player1.getPoints());
        System.out.println(player2.getName() + "'s score: " + player2.getPoints());

        // compares score of both players and displays who won
        if (player1.getPoints() > player2.getPoints()) {
            System.out.println("Congratulations, " + player1.getName() + ", you won!");
        } else {
            System.out.println("Congratulations, " + player2.getName() + ", you won!");
        }
    }
}
