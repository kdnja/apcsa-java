import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Random;
import java.io.*;

/**
 * Class that contains helper methods for the Review Lab
 **/
public class Review {

    private static HashMap<String, Double> sentiment = new HashMap<String, Double>();
    private static ArrayList<String> posAdjectives = new ArrayList<String>();
    private static ArrayList<String> negAdjectives = new ArrayList<String>();

    private static final String SPACE = " ";

    static {
        try {
            Scanner input = new Scanner(new File("cleanSentiment.csv"));
            while (input.hasNextLine()) {
                String[] temp = input.nextLine().split(",");
                sentiment.put(temp[0], Double.parseDouble(temp[1]));
                //System.out.println("added "+ temp[0]+", "+temp[1]);
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing cleanSentiment.csv");
        }

        //read in the positive adjectives in positiveAdjectives.txt
        try {
            Scanner input = new Scanner(new File("positiveAdjectives.txt"));
            while (input.hasNextLine()) {
                String temp = input.nextLine().trim();
                System.out.println(temp);
                posAdjectives.add(temp);
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing positiveAdjectives.txt\n" + e);
        }

        //read in the negative adjectives in negativeAdjectives.txt
        try {
            Scanner input = new Scanner(new File("negativeAdjectives.txt"));
            while (input.hasNextLine()) {
                negAdjectives.add(input.nextLine().trim());
            }
            input.close();
        } catch (Exception e) {
            System.out.println("Error reading or parsing negativeAdjectives.txt");
        }
    }

    /** 
     * returns a string containing all of the text in fileName (including punctuation), 
     * with words separated by a single space 
     */
    public static String textToString(String fileName) {
        String temp = "";
        try {
            Scanner input = new Scanner(new File(fileName));

            //add 'words' in the file to the string, separated by a single space
            while (input.hasNext()) {
                temp = temp + input.next() + " ";
            }
            input.close();

        } catch (Exception e) {
            System.out.println("Unable to locate " + fileName);
        }
        //make sure to remove any additional space that may have been added at the end of the string.
        return temp.trim();
    }

    /**
     * @returns the sentiment value of word as a number between -1 (very negative) to 1 (very positive sentiment) 
     */
    public static double sentimentVal(String word) {
        try {
            return sentiment.get(word.toLowerCase());
        } catch (Exception e) {
            return 0;
        }
    }

    /**
     * Returns the ending punctuation of a string, or the empty string if there is none 
     */
    public static String getPunctuation(String word) {
        String punc = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            if (!Character.isLetterOrDigit(word.charAt(i))) {
                punc = punc + word.charAt(i);
            } else {
                return punc;
            }
        }
        return punc;
    }

    /**
    * Returns the word after removing any beginning or ending punctuation
    */
    public static String removePunctuation(String word) {
        while (word.length() > 0 && !Character.isAlphabetic(word.charAt(0))) {
            word = word.substring(1);
        }
        while (word.length() > 0 && !Character.isAlphabetic(word.charAt(word.length() - 1))) {
            word = word.substring(0, word.length() - 1);
        }

        return word;
    }

    /** 
     * Randomly picks a positive adjective from the positiveAdjectives.txt file and returns it.
     */
    public static String randomPositiveAdj() {
        int index = (int) (Math.random() * posAdjectives.size());
        return posAdjectives.get(index);
    }

    /** 
     * Randomly picks a negative adjective from the negativeAdjectives.txt file and returns it.
     */
    public static String randomNegativeAdj() {
        int index = (int) (Math.random() * negAdjectives.size());
        return negAdjectives.get(index);

    }

    /** 
     * Randomly picks a positive or negative adjective and returns it.
     */
    public static String randomAdjective() {
        boolean positive = Math.random() < .5;
        if (positive) {
            return randomPositiveAdj();
        } else {
            return randomNegativeAdj();
        }
    }

    // Activity 2 Method //
    /* Method to determine a total sentiment value based on the sentiment value of all the words in a review found in a file
     * 
     * Preconditions: txt file must exist
     * Postconditions: txt file remains intact and a total sentiment value is returned
     * 
     * @param fileName - the name of the txt file with the review
     * @return the total sentiment value as a double
     */
    public static double totalSentiment(String fileName) {
        String str = textToString(fileName);
        String word = "";
        double num = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                word += str.substring(i, i + 1);
            } else {
                if (sentimentVal(word) != 0.0) {
                    num += sentimentVal(word);
                }
                word = "";
            }
        }
        return num;
    }

    /* Method to determine the star rating of a review based off of the total sentiment
     * 
     * Preconditions: txt file must exist 
     * Postconditions: txt file remains intact and a star rating is returned
     * 
     * @param fileName - the name of the txt file with the review
     * @return the star rating as an integer
     */
    public static int starRating(String fileName) {
        double total = totalSentiment(fileName);
        if (total >= 15.0) {
            return 4;
        } else if (total >= 10.0) {
            return 3;
        } else if (total >= 5.0) {
            return 2;
        } else if (total >= 0.0) {
            return 1;
        } else {
            return 0;
        }
    }

    /* Method to create a fake review based on "starred" words
     * 
     * Preconditions: txt file must exist with "starred" words
     * Postconditions: txt file remains intact and a fake review is generated
     * 
     * @param fileName - the name of the txt file with the review
     * @return the fake review as a String
     */
    public static String fakeReview(String fileName) {
        // contents of text file
        String fileText = textToString(fileName);
        // empty String to store the answer
        String answer = "";
        // index of the asterisk
        int asterIndex = fileText.indexOf("*");

        // loops while there is an asterisk
        while (asterIndex > -1) {
            // find the next space from the asterisk index
            int nextSpace = fileText.indexOf(" ", asterIndex);
            // adds the first part of fileText to answer
            answer += fileText.substring(0, asterIndex);
            // empty String for punctuation
            String punc = "";

            // if the asterisk is before the last word in fileText
            if (nextSpace == -1) {
                // get the punctuation at the end of fileText
                punc = getPunctuation(fileText);
                // reset value of fileText
                fileText = "";
            } else {
                // assigns word by getting the character after the asterisk and the character before the next space
                String word = fileText.substring(asterIndex + 1, nextSpace);
                // get punctuation at the end of the word
                punc = getPunctuation(word);
                // add a space afterwards
                punc += " ";
                // get the rest of the string that's after the space
                fileText = fileText.substring(nextSpace + 1);
            }

            // concatenate random adjective
            answer += randomAdjective();

            // concatenate punctuation
            answer += punc;

            // reassign asterisk index to next asterisk
            asterIndex = fileText.indexOf("*");
        }

        // adds the rest of the string that's after the space
        answer += fileText;
        // returns the fake review
        return answer;
    }

    /** 
     * Main (written by Caden Jamason)
     */
    public static void main(String[] args) {
        double total = totalSentiment("SimpleReview.txt");
        double star = starRating("SimpleReview.txt");
        String fakeReview = fakeReview("SimpleReview.txt");

        System.out.println(total);
        System.out.println(star);
        System.out.println(fakeReview);
    }
}
