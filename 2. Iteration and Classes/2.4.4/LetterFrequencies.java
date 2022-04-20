/*
 * Activity 2.4.4
 */
public class LetterFrequencies {
    public static void main(String[] args) {
        String letters = "abcdefghijklmnopqrstuvwxyz";
        String phrase = "This is a phrase!";
        int letterIndex = 0;
        int phraseIndex = 0;

        System.out.println("The following shows the letter frequencies for the phrase");

        while (letterIndex < letters.length()) {
            int counter = 0;
            while (phraseIndex < phrase.length()) {
                if (letters.substring(letterIndex, letterIndex + 1).toLowerCase()
                        .equals(phrase.substring(phraseIndex, phraseIndex + 1).toLowerCase())) {
                    counter++;
                }
                phraseIndex++;
            }
            if (counter > 0) {
                System.out.println(letters.substring(letterIndex, letterIndex + 1) + ": " + counter);
            }
            letterIndex++;
            phraseIndex = 0;
        }
    }
}
