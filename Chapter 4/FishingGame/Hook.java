/**
 * Activity 4.9.3
 */
public class Hook extends LakeObject {
    private int strength = 45;

    /*---------- accessor ----------*/
    public int getStrength() {
        return strength; // This return will be updated in the next activity
        // return strength;
    }

    @Override
    public String say() {
        return "You now have a hook!";
    }

}
