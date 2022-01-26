
/*
 * Activity 2.5.2
 *
 * A Board class the PhraseSolverGame
 */
import java.util.Scanner;
import java.io.File;

public class Board {
    private String phrase;
    private String solvedPhrase;
    private int currentLetterValue;

    /* constructor(s) */

    public Board() {
        phrase = "";
        solvedPhrase = "";
        currentLetterValue = 0;

        phrase = loadPhrase(); // initializes phrase
        setLetterValue();
    }

    /* accessor(s) */

    public String getPhrase() {
        return phrase;
    }

    public String getSolvedPhrase() {
        return solvedPhrase;
    }

    public int getLetterValue() {
        return currentLetterValue;
    }

    /* mutator(s) */

    /* ---------- provided code, do not modify ---------- */
    public void setLetterValue() {
        int randomInt = (int) ((Math.random() * 10) + 1) * 100;
        currentLetterValue = randomInt;
    }

    public boolean isSolved(String guess) {
        if (phrase.equals(guess)) {
            return true;
        }
        return false;
    }

    private String loadPhrase() {
        String tempPhrase = "";

        int numOfLines = 0;
        try {
            Scanner sc = new Scanner(new File("phrases.txt"));
            while (sc.hasNextLine()) {
                tempPhrase = sc.nextLine().trim();
                numOfLines++;
            }
        } catch (Exception e) {
            System.out.println("Error reading or parsing phrases.txt");
        }

        int randomInt = (int) ((Math.random() * numOfLines) + 1);

        try {
            int count = 0;
            Scanner sc = new Scanner(new File("phrases.txt"));
            while (sc.hasNextLine()) {
                count++;
                String temp = sc.nextLine().trim();
                if (count == randomInt) {
                    tempPhrase = temp;
                }
            }
        } catch (Exception e) {
            System.out.println("Error reading or parsing phrases.txt");
        }

        for (int i = 0; i < tempPhrase.length(); i++) {
            if (tempPhrase.substring(i, i + 1).equals(" ")) {
                solvedPhrase += "  ";
            } else {
                solvedPhrase += "_ ";
            }
        }

        return tempPhrase;
    }

    /*  Overwrites the solved phrase with the new solved phrase and returns if a
     *  letter was found or not in a boolean statement
     *  
     *  Preconditions:
     *      The instance variable phrase is populated
     *      The instance variable solvedPhrase is populated with _ or a 
     *      character, along with a space character for each character in 
     *      the phrase
     *  Postconditions:
     *      The instance variable solvedPhrase is populated with _ or a 
     *      character, along with a space character for each character in 
     *      the phrase
     */
    public boolean guessLetter(String guess) {
        // initializes boolean foundLetter with a value of false
        boolean foundLetter = false;
        // initializes String newSolvedPhrase with a value of ""
        String newSolvedPhrase = "";
        // loops through all character in a string
        for (int i = 0; i < phrase.length(); i++) {
            // compares each letter to guess
            if (phrase.substring(i, i + 1).equals(guess)) {
                // adds the correct guess to the newly solved phrase with a space
                newSolvedPhrase += guess + " ";
                // sets foundLetter to true
                foundLetter = true;
            } else {
                // adds an underscore to the new solved phrase with a space 
                newSolvedPhrase += solvedPhrase.substring(i * 2, i * 2 + 1) + " ";
            }
        } // end of for loop

        // overwrites the solvedPhrase with the new one
        solvedPhrase = newSolvedPhrase;
        // returns if a letter was found or not in a boolean statement
        return foundLetter;
    }
}
