
public class Boot extends LakeObject {
    private int cost;

    // calls super()
    public Boot() {
        super();
        cost = 0;
    }

    @Override
    public int getCost() {
        return cost;
    }

    @Override
    public String say() {
        return "You have collected a boot!";
    }

    @Override
    public boolean wasCaught(Hook h) {
        return true;
    }
}
