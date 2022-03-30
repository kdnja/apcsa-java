public class Owl extends Animal {
    public Owl() {}

    public Owl(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
    }

    public void hunt() {
        System.out.println("The owl hunts for food.");
    }
}
