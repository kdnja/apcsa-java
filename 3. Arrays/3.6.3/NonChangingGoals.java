/*
 * Activity 3.6.3
 * 
 * NOTE: The intention of the program is to change every value in goals to 0. I predict that the
 * values in goals will not change because int g is receiving a copy of the array. This means that
 * the for loop cannot modify any values in the goals array.
 */
public class NonChangingGoals {
    public static void main(String[] args) {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};

        // start a new season!
        for (int g : goals) {
            g = 0;
        }

        for (int g : goals) {
            System.out.print(g + " ");
        }
    }
}
