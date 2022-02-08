/*
 * Activity 3.6.2
 */
public class TraverseBackwards {
    public static void main(String[] args) {
        int[] goals = { 1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2 };
        // For loop to display goals in reverse order
        for (int i = 13; i > 0; i--) {
            System.out.println("Game " + (i + 1) + ": " + goals[i]);
        }
        // For loop to display every other goal in reverse order
        for (int i = 13; i > 0; i = i - 2) {
            System.out.println("Game " + (i + 1) + ": " + goals[i]);
        }
    }
}
