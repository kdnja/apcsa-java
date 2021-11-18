/*
 * Activity 1.1.4
 *
 * TODO 1) Add at least three other people to your program,
 * such as siblings, friends, or neighbors. 
 *
 * TODO 2) Use people that are in different grades to validate
 * your program can work for different school grades. 
 * 
 * TODO 3) For their years in school, use values that indicate 
 * they will soon be halfway through their current
 * school year, as shown in the provided code.
 *
 * TODO 4)The average years you and your friends, siblings,
 * neighbors have been in school. 
 *
 * TODO 5) The total days you have all been in school,
 * assuming you spend 180 days per year in school.
 * 
 * TODO 6) The average days you have all spent in school. 
 */
public class CompoundOperators {
  public static void main(String[] args) {
    int numPeople = 0;
    double totalYears = 0;
    int gradYear = 13;

    double years = 11.5; // I will soon be halfway through my junior year.

    System.out.println("I have " + years + " years in school.");
    System.out.println("I have spent approximately " + (years * 180) + " days in school.");
    System.out.println("I will graduate in " + (gradYear - years) + " years.");

    totalYears += years;
    numPeople++;

    System.out.println();

    years = 9.5; // I will soon be halfway through my freshman year.

    System.out.println("I have " + years + " years in school.");
    System.out.println("I have spent approximately " + (years * 180) + " days in school.");
    System.out.println("I will graduate in " + (gradYear - years) + " years.");

    totalYears += years;
    numPeople++;

    System.out.println();

    years = 12.5; // I will soon be halfway through my senior year.

    System.out.println("I have " + years + " years in school.");
    System.out.println("I have spent approximately " + (years * 180) + " days in school.");
    System.out.println("I will graduate in " + (gradYear - years) + " years.");

    totalYears += years;
    numPeople++;

    System.out.println();

    System.out.print("Total people: " + numPeople);
    System.out.print(", total years: " + totalYears);
    System.out.print(", total days: " + (totalYears * 180));
    System.out.print(", average amount of days: " + ((totalYears * 180) / numPeople));
  }
}