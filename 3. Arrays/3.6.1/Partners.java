/*
 * Activity 3.6.1
 */
public class Partners {
    public static void main(String[] args) {

        /* Arrays of Objects */

        // String[] days; // not initialized
        // System.out.println(days); // error: days may not be initialized

        String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        String[] partners = new String[6];
        System.out.println(partners[0]); // initial value: "null"

        /*
         * Elements of an object reference type (e.g. String, Double, Integer)
         * are initialized to the reference type null.
         * No objects are automatically created.
         */

        partners[1] = "Ava";
        partners[3] = "Jordan";
        partners[5] = "Ryan";

        System.out.println(days[1] + ", " + partners[1]);
        System.out.println(days[3] + ", " + partners[3]);
        System.out.println(days[5] + ", " + partners[5]);

        /*
         * friendPartners points to the same actual array in memory as the
         * partners reference
         * 
         * This means that any change to the array is seen by both object
         * references
         */
        String[] friendPartners = partners;
        System.out.println(days[1] + ", " + friendPartners[1]);
        System.out.println(days[3] + ", " + friendPartners[3]);
        System.out.println(days[5] + ", " + friendPartners[5]);

        /*
         * Change first partner to Joe
         * Affects all array references pointing to the current array
         */

        partners[1] = "Joe";
        System.out.println(days[1] + ", " + friendPartners[1]);
    }
}
