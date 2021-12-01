/* 
 * Activity 1.1.5
 */
public class FivePlanetTravel {
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

    // --- widening algorithm ---
    System.out.println("\n---\nWidening algorithm\n---");

    // go through each planet and divide by our speed for the time it takes to get
    // there
    double mercuryCalc = mercury;
    mercuryCalc /= lightSpeed;
    double venusCalc = venus;
    venusCalc /= lightSpeed;
    double marsCalc = mars;
    marsCalc /= lightSpeed;
    double jupiterCalc = jupiter;
    jupiterCalc /= lightSpeed;
    double saturnCalc = saturn;
    saturnCalc /= lightSpeed;
    total += mercuryCalc + venusCalc + marsCalc + jupiterCalc + saturnCalc;

    // print out travel time for each planet
    System.out.println("Travel time to Mercury: " + mercuryCalc + " hours.");
    System.out.println("Travel time to Venus: " + venusCalc + " hours.");
    System.out.println("Travel time to Mars: " + marsCalc + " hours.");
    System.out.println("Travel time to Jupiter: " + jupiterCalc + " hours.");
    System.out.println("Travel time to Saturn: " + saturnCalc + " hours.");

    // print out total time
    System.out.println("Total travel time: " + total + " hours.\n---");

    // calculate average travel time
    int average = (int) (total / numPlanets + .5);

    // print out average travel time
    System.out.println("Average travel time: " + average + " hours.");

    // --- casting algorithm ---
    System.out.println("\n---\nCasting algorithm\n---");

    // reset total
    total = 0;

    // add the travel time for each planet
    // each planet is casted to a double for accuracy
    total += (double) mercury / lightSpeed;
    total += (double) venus / lightSpeed;
    total += (double) mars / lightSpeed;
    total += (double) jupiter / lightSpeed;
    total += (double) saturn / lightSpeed;

    // print out travel time for each planet
    System.out.println("Travel time to Mercury: " + (double) mercury / lightSpeed + " hours.");
    System.out.println("Travel time to Venus: " + (double) venus / lightSpeed + " hours.");
    System.out.println("Travel time to Mars: " + (double) mars / lightSpeed + " hours.");
    System.out.println("Travel time to Jupiter: " + (double) jupiter / lightSpeed + " hours.");
    System.out.println("Travel time to Saturn: " + (double) saturn / lightSpeed + " hours.");

    // print out total travel time
    System.out.println("Total travel time: " + total + " hours.\n---");

    // calculate the average travel time
    average = (int) (total / numPlanets + .5);

    // print out average travel time
    System.out.println("Average travel time: " + average + " hours.");
  }
}