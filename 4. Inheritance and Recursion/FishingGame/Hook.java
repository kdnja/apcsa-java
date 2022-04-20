public class Hook extends LakeObject {
    private int strength; // initializes private int strength
    private int cost;

    // calls super()
    public Hook() {
        super(); // invokes the default constructor of LakeObject
        strength = 55; // initializes value of strength
        cost = 15; // initializes value of cost
    }

    /*---------- accessor ----------*/
    public int getStrength() {
        return strength;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String say() {
        return "You now have a hook!";
    }

}
