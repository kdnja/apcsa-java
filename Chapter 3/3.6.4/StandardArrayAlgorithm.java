/*
 * Activity 3.6.4
 */
public class StandardArrayAlgorithm {
    public static void main(String[] args) {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};

        int sum = 0;
        for (int g : goals) {
            sum += g;
        }

        // calculates the average amount of goals from the sum
        double avg = sum / goals.length;

        int max = goals[0];
        for (int g : goals) {
            if (max < g) {
                max = g;
            }
        }

        int min = goals[0];
        for (int g : goals) {
            if (min > g) {
                min = g;
            }
        }

        // Prints out the sum of all goals
        System.out.println("All goals: " + sum);
        // Prints out the average amount of goals
        System.out.println("Average amount of goals: " + avg);
        // Prints out the maximum amount of goals
        System.out.println("Maximum amount of goals: " + max);
        // Prints out the minimum amount of goals
        System.out.println("Minimum amount of goals: " + min);

        int[] goalCounter = new int[10];
    }
}
