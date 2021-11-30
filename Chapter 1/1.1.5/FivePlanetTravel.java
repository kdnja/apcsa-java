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

    // Casting version
    System.out.println("Travel time to mercury: " + mercury / (double) lightSpeed + " hours.");
    System.out.println("Travel time to venus: " + venus / (double) lightSpeed + " hours.");
    System.out.println("Travel time to mars: " + mars / (double) lightSpeed + " hours.");
    System.out.println("Travel time to jupiter: " + jupiter / (double) lightSpeed + " hours.");
    System.out.println("Travel time to saturn: " + saturn / (double) lightSpeed + " hours.");

    // Widening version
    double calc = mercury;
    calc /= lightSpeed;
    System.out.println("Travel time to mercury: " + calc + " hours.");

    calc = venus;
    calc /= lightSpeed;
    System.out.println("Travel time to venus: " + calc + " hours.");

    calc = mars;
    calc /= lightSpeed;
    System.out.println("Travel time to mars: " + calc + " hours.");

    calc = jupiter;
    calc /= lightSpeed;
    System.out.println("Travel time to jupiter: " + calc + " hours.");

    calc = saturn;
    calc /= lightSpeed;
    System.out.println("Travel time to saturn: " + calc + " hours.");
  }
}
