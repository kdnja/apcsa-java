/*
 * Activity 3.6.3
 * 
 * NOTE: For the output of the EnhancedForStates program, I predict that the for loop will traverse
 * the list and print out every value in newEngland (CORRECT ANSWER)
 */
public class EnhancedForStates {
    public static void main(String[] args) {
        String[] newEngland = {"Maine", "New Hampshire", "Vermont", "Massachusetts", "Connecticut",
                "Rhode Island"};

        System.out.println("The New England States:");
        for (String state : newEngland) {
            System.out.println(state);
        }
    }
}
