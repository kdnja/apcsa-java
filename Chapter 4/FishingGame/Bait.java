public class Bait extends LakeObject {
    private int cost;

    // calls super()
    public Bait() {
        super();
        cost = 10;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String say() {
        return "You have collected bait!";
    }
}
