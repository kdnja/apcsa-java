/* 
 * Activity 1.1.5
 */
public class FivePlanetTravelWidening {
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
    System.out.println("Widening algorithm\n---");

    total = 0;
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

    System.out.println("Travel time to Mercury: " + mercuryCalc + " hours.");
    System.out.println("Travel time to Venus: " + venusCalc + " hours.");
    System.out.println("Travel time to Mars: " + marsCalc + " hours.");
    System.out.println("Travel time to Jupiter: " + jupiterCalc + " hours.");
    System.out.println("Travel time to Saturn: " + saturnCalc + " hours.");

    System.out.println("Total travel time: " + total + " hours.\n---\n");

    int average = (int) (total / numPlanets + .5);
    System.out.println("Average travel time: " + average + " hours.");
  }
}
