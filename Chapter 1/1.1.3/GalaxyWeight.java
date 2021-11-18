/* 
 * Activity 1.1.3
 */
public class GalaxyWeight {
  public static void main(String[] args) {
    // declare and initialize weightOnEarth, earthGravity, and jupiterGravity
    int weightOnEarth = 177;
    double mercuryGravity = 3.59;
    double venusGravity = 8.87;
    double earthGravity = 9.81;
    double marsGravity = 3.711;
    double jupiterGravity = 24.79;
    double saturnGravity = 11.08;
    double uranusGravity = 10.67;
    double neptuneGravity = 11.15;
    // calculate weight
    double weightOnMercury = weightOnEarth * mercuryGravity / earthGravity;
    double weightOnVenus = weightOnEarth * venusGravity / earthGravity;
    double weightOnMars = weightOnEarth * marsGravity / earthGravity;
    double weightOnJupiter = weightOnEarth * jupiterGravity / earthGravity;
    double weightOnSaturn = weightOnEarth * saturnGravity / earthGravity;
    double weightOnUranus = weightOnEarth * uranusGravity / earthGravity;
    double weightOnNeptune = weightOnEarth * neptuneGravity / earthGravity;
    double galaxyWeight = (weightOnMercury + weightOnVenus + weightOnEarth + weightOnMars + weightOnJupiter
        + weightOnSaturn + weightOnUranus + weightOnNeptune) / 7;
    // show results
    System.out.print("Your weight on Mercury is ");
    System.out.println(weightOnMercury + " lbs.");
    System.out.print("Your weight on Venus is ");
    System.out.println(weightOnVenus + " lbs.");
    System.out.print("Your weight on Earth is ");
    System.out.println(weightOnEarth + " lbs.");
    System.out.print("Your weight on Mars is ");
    System.out.println(weightOnMars + " lbs.");
    System.out.print("Your weight on Jupiter is ");
    System.out.println(weightOnJupiter + " lbs.");
    System.out.print("Your weight on Saturn is ");
    System.out.println(weightOnSaturn + " lbs.");
    System.out.print("Your weight on Uranus is ");
    System.out.println(weightOnUranus + " lbs.");
    System.out.print("Your weight on Neptune is ");
    System.out.println(weightOnNeptune + " lbs.");
    System.out.println();
    System.out.print("Your galaxy weight is " + galaxyWeight + " lbs.");
  }
}