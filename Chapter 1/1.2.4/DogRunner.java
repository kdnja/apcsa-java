/*
 * Activity 1.2.4
 */
public class DogRunner {
  public static void main(String[] args) {
    // myDog //

    // No arguments given to parameter; error
    // Dog myDog = new Dog();

    // Creates a new Dog named "Fido" under object "myDog"
    Dog myDog = new Dog("Fido");

    // Incompatible types due to ordering issue
    // myDog.eat(1.5, "kibble", 2);

    // Calls method "eat" for object "myDog"
    myDog.eat("kibble", 1.5, 2);

    // Park needs to be a string
    // myDog.walk(30, park);

    // Calls method "walk" for object "myDog"
    myDog.walk(30, "Balboa Park");

    // Daisy //

    Dog daisy = new Dog("Daisy");
    daisy.eat("kibble"); // Daisy eats kibble
    // No food scoped, so it will produce an error
    daisy.eat(2); // twice a day
  }
}