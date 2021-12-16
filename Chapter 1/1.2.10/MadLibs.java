/* Mad Libs Project

Authors: Ashley, Caden, and Kaia
Date: 12/16/21
Course: AP CSA 1

Description: This code allows a user to fill out a Mad Lib by inputting the words they want to use. This is done by taking user input and adding the new word to a previously blank string.

Preconditions: user needs to enter a part of speech that they are promoted with

Postconditions: the code prints out the new mab lib with the part of speech replaced with the user's chosen word 
*/

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {
        // creates a scanner to process terminal input
        Scanner sc = new Scanner(System.in);

        // Test cases
        String lib = "Harry was <verb> to school. During his trip, he saw his <adj> friend that he has first period with. On his way to school he remembered that he forgot his <noun> which he normally brought with him everyday.";
        // String lib = "I went to the animal <noun>, the <plural_noun> and the <number>
        // beasts were there.";
        // String lib = "Once upon a time in a <adjective> land, a <noun> <adverb>
        // grew.";

        // This is a blank string that throughout the code we add to and then we print
        String riddle = "";

        // Creates a variable that looks fBor < and > in the code
        int start = lib.indexOf("<");
        int end = lib.indexOf(">");

        // This creates a substring of the original string lib that allows us to assign
        // a
        // variable to the parts of speech we want to replace with words
        String temp = lib.substring(start + 1, end);
        // This prints the part of speech we want to replace
        System.out.println("Enter " + temp + ":");
        String str = sc.nextLine(); // reads user input
        // This adds the new word and the start of the string to the blank string
        // riddle, so that we can at the end print a new string with the new words
        riddle += lib.substring(0, start) + str;

        // This creates a substring of the original string lib that starts where the
        // last
        // substring just ended so that when we look for > and < we can find the next
        // one and not the very first one.
        String newString = lib.substring(end + 1);
        // This sets up the variables again to allow us to find the part of speech
        // between < and >
        start = newString.indexOf("<");
        end = newString.indexOf(">");
        // this sets the newString with a substring equal to a string called var. Var is
        // the new part of speech that we want to replace
        String var = newString.substring(start + 1, end);
        // This prints the part of speech we want to replace
        System.out.println("Enter " + var + ":");
        str = sc.nextLine(); // reads user input
        // This adds the new word and the start of the string to the blank string
        // riddle, so that we can at the end print a new string with the new words
        riddle += newString.substring(0, start) + str;

        // This creates a substring of the original string lib that starts where the
        // last
        // substring just ended so that when we look for > and < we can find the next
        // one and not the very first one.
        String myString = newString.substring(end + 1);
        // This sets up the variables again to allow us to find the part of speech
        // between < and >
        start = myString.indexOf("<");
        end = myString.indexOf(">");
        // This sets the newString with a substring equal to a string called var. Var is
        // the new part of speech that we want to replace
        var = myString.substring(start + 1, end);
        // This prints the part of speech we want to replace
        System.out.println("Enter " + var + ":");
        str = sc.nextLine(); // reads user input
        riddle += myString.substring(0, start) + str;

        // Adds the end of the Mad Lib to complete the Mad Lib
        String stringEnd = myString.substring(end + 1);
        // This adds the new word and the start of the string to the blank string
        // riddle, so that we can at the end print a new string with the new words
        riddle += stringEnd;

        // Prints the Mad Lib for the user to see
        System.out.println(riddle);

    }
}
