/*
 * Activity 3.6.4
 */
public class StandardArrayAlgorithms {
    public static void main(String[] args) {
        int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 0, 2, 0, 1, 3, 2};
        // int[] goals = {1, 2, 0, 3, 2, 4, 2, 1, 1};
        // int[] goals = {1, 0, 3, 3, 2, 2, 5, 6, 3, 2};
        int[] goalCounter = new int[10];

        // Calculates the sum of all goals
        int sum = 0;
        for (int g : goals) {
            sum += g;
            goalCounter[g]++;
        }
        System.out.println("All goals: " + sum);

        // Calculates the average amount of goals from the sum
        double avg = sum / goals.length;
        System.out.println("Average amount of goals: " + avg);

        // Calculates the maximum amount of goals in the array
        int max = goals[0];
        for (int g : goals) {
            if (max < g) {
                max = g;
            }
        }
        System.out.println("Maximum amount of goals: " + max);

        // Calculates the minimum amount of goals in the array
        int min = goals[0];
        for (int g : goals) {
            if (min > g) {
                min = g;
            }
        }
        System.out.println("Minimum amount of goals: " + min);

        // Calculates and prints out the number of games with a certain amount of goals
        for (int g = 0; g < goalCounter.length; g++) {
            if (goalCounter[g] != 0) {
                System.out.println("Games with " + g + " goals: " + goalCounter[g]);
            }
        }
        /*
         * Calculates the mode in goal counter.
         * 
         * NOTE: This algorithm does not work as intended with bimodal arrays; it will print out the
         * mode with the lowest value first.
         */
        int goalCounterMax = goalCounter[0];
        int modeIndex = 0;
        for (int goal = 0; goal < goalCounter.length; goal++) {
            if (goalCounterMax < goalCounter[goal]) {
                goalCounterMax = goalCounter[goal];
                modeIndex = goal;
            }
        }
        System.out.println(
                "Mode is " + modeIndex + " goals and occurs " + goalCounterMax + " times.");

        // Creates an array of Player objects with defined names and ages
        Player[] players = {new Player("Alex", 12), new Player("Aiden", 13),
                new Player("Bobbie", 18), new Player("Blaine", 20), new Player("Chris", 15),
                new Player("Charlie", 15)};

        // Value that determines if players are 18 or over
        boolean hasValue = false;
        // Value that determines if all the players are under 21
        boolean allHasValue = true;
        // Index for player while loop
        int playerIndex = 0;
        // Traverse the array while the value hasn't been found. If the player at the current index
        // is 18 or over, set hasValue to true and stop iterating the loop. Otherwise, increment the
        // index
        while (playerIndex < players.length && hasValue == false) {
            if (players[playerIndex].getAge() >= 18) {
                hasValue = true;
            }
            playerIndex++;
        }
        System.out.println("Are there players over 18?: " + hasValue);

        // Reset playerIndex back to 0 for next while loop
        playerIndex = 0;
        // Traverse the array while all players traversed are under 21. If the player at the current
        // index is 21 or over, set allHasValue to false and stop iterating the loop. Otherwise,
        // increment the index
        while (playerIndex < players.length && allHasValue == true) {
            if (players[playerIndex].getAge() >= 21) {
                allHasValue = false;
            }
            playerIndex++;
        }
        System.out.println("Are all players under 21?: " + allHasValue);


        int playersAged15 = 0;
        for (Player player : players) {
            if (player.getAge() == 15) {
                playersAged15++;
            }
        }
        System.out.println("How many players are 15?: " + playersAged15);

        // Prints out players in pairs
        for (int index = 0; index < players.length; index += 2) {
            System.out.println(players[index].getName() + " and " + players[index + 1].getName());
        }

        String[] arr1 = {"A", "B", "C", "D", "E", "F"};
        // Puts the last value in the array to the front
        for (int i = arr1.length; i > 1; i--) {
            String tmp = arr1[i - 2];
            arr1[i - 2] = arr1[i - 1];
            arr1[i - 1] = tmp;
        }

        String[] arr2 = {"A", "B", "C", "D", "E", "F"};
        // Reverses the order of the array
        for (int i = 0; i < arr2.length / 2; i++) {
            String tmp = arr2[i];
            arr2[i] = arr2[arr2.length - i - 1];
            arr2[arr2.length - i - 1] = tmp;
        }
    }
}
