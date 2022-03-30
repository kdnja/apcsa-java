public class Elephant extends Animal {
    public Elephant() {
        System.out.println("An elephant arrives.");
    }

    public Elephant(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("An elephant arrives.");
    }

    public void trumpet() {
        System.out.println("The elephant trumpets a valiant toot.");
    }

    public void forage() {
        System.out.println("The elephant forages for food.");
    }
}
