public class Feline extends Animal {
    public Feline() {
        System.out.println("A feline arrives.");
    }

    public Feline(String food, boolean nocturnal, double aveLifeSpan) {
        super(food, nocturnal, aveLifeSpan);
        System.out.println("A feline arrives.");
    }

    public void roar() {
        System.out.println("ROAR!");
    }

    public void growl() {
        System.out.println("Grr...");
    }
}
