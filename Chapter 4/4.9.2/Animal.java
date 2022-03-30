/*
 * Activity 4.9.2
 */
public class Animal {
    private String food;
    private boolean nocturnal;
    private double aveLifeSpan;

    // No-arg constructor for Animal
    // Required for an implicit call to Animal
    public Animal() {}

    // Constructor for Animal
    public Animal(String food, boolean nocturnal, double aveLifeSpan) {
        this.food = food;
        this.nocturnal = nocturnal;
        this.aveLifeSpan = aveLifeSpan;
    }

    public void eat() {
        System.out.println("This animal's diet consists of " + food + ".");
    }

    public void isNocturnal() {
        if (nocturnal)
            System.out.println("This animal is active at night.");
        else
            System.out.println("This animal is active during the day.");
    }

    public void getLifeSpan() {
        System.out.println("This animal's life span is " + aveLifeSpan + " years.");
    }
}
