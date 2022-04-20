/*
 * Activity 3.6.3
 * 
 * NOTE: Strings are objects, but because they are immutable (unchangeable), you cannot change their
 * state as you did with the Cat objects. (Consider how there are no String methods that allow you
 * to change a value; they simply return other String values.) Therefore, they behave like primitive
 * values when you traverse them in enhanced for loops.
 */
public class ImmutableStates {
    public static void main(String[] args) {
        String[] newEngland = {"Maine", "New Hampshire", "Vermont", "Massachusetts", "Connecticut",
                "Rhode Island"};

        System.out.println("The New England States:");

        for (String state : newEngland) {
            state = "";
        }

        for (String state : newEngland) {
            System.out.println(state);
        }

    }
}
