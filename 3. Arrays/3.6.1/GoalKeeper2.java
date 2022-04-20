/*
 * Activity 3.6.1
 */
public class GoalKeeper2 {
    public static void main(String[] args) {

        /* Array Creation with new */

        int[] ourGoals = new int[28];
        System.out.println(ourGoals[5]); // goals scored in 6th game; returns 0

        /*
         * When an array is created using the keyword new, all of its elements
         * are initialized with a specific value based on the type of elements
         * 
         * Elements of type int are initialized to 0
         * Elements of type double are initialized to 0.0
         * Elements of type boolean are initialized to false
         */

        // int theirGoals[]; // declaration only; results in an error
        int[] theirGoals = new int[28];
        System.out.println(theirGoals); // shows reference address to the array

        // Our team scored 3 goals in 1st game
        ourGoals[0] = 3;
        // Their team scored 1 goal in 1st game
        theirGoals[0] = 1;

        System.out.println("Our goals in 1st game: " + ourGoals[0] + "\nTheir goals in 1st game: " + theirGoals[0]);

    }
}