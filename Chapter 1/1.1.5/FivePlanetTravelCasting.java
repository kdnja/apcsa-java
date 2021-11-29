/* 
 * Activity 1.1.5
 */
public class FivePlanetTravelCasting {
    public static void main(String[] args) {
        // theplanets.org average distance from earth to the planets
        int mercury = 56974146;
        int venus = 25724767;
        int mars = 48678219;
        int jupiter = 390674710;
        int saturn = 792248270;

        // number of planets to visit
        int numPlanets = 5;

        // speed of light and our speed
        int lightSpeed = 670616629;
        lightSpeed /= 10;

        // total travel time
        double total = 0;

        /* your code here */
        System.out.println("Casting algorithm\n---");

        total = 0;
        total += (double) mercury / lightSpeed;
        total += (double) venus / lightSpeed;
        total += (double) mars / lightSpeed;
        total += (double) jupiter / lightSpeed;
        total += (double) saturn / lightSpeed;
        System.out.println("Travel time to Mercury: " + (double) mercury / lightSpeed + " hours.");
        System.out.println("Travel time to Venus: " + (double) venus / lightSpeed + " hours.");
        System.out.println("Travel time to Mars: " + (double) mars / lightSpeed + " hours.");
        System.out.println("Travel time to Jupiter: " + (double) jupiter / lightSpeed + " hours.");
        System.out.println("Travel time to Saturn: " + (double) saturn / lightSpeed + " hours.");

        System.out.println("Total travel time: " + total + " hours.\n---");

        int average = (int) (total / numPlanets + .5);
        System.out.println("Average travel time: " + average + " hours.");

    }
}
