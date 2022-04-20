public class ZooKeeperRunner {
    public static void main(String[] args) {
        Elephant elephant = new Elephant("leaves, grasses, roots", false, 60.0);
        elephant.trumpet();
        elephant.eat();
        elephant.isNocturnal();

        Tiger tiger = new Tiger("meat", true, 17.0);
        // Subclass-specific methods
        tiger.swim();
        tiger.huntAlone();
        // Superclass-specific methods
        tiger.eat();
        tiger.growl();
        tiger.roar();

        Gorilla gorilla = new Gorilla();
        gorilla.grunt();
        gorilla.forage();
        gorilla.eat();

        Hippo hippo = new Hippo();
        hippo.eat();

        Penguin penguin = new Penguin();
        penguin.fish();

        Owl owl = new Owl();
        owl.hunt();
        Owl owl2 = new Owl("mice and insects", true, 4.0);
        owl2.eat();
    }
}
