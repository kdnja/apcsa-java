/*
 * Activity 2.5.8
 * 
 * The static version of the runner for the MediaLibrary program
 */
public class MediaLibRunnerStatic {
    public static void main(String[] args) {
        System.out.println(MediaLib.getOwner() + "'s Library");

        // redundant call to MediaLib owner; owner is a public static variable
        MediaLib.changeOwner("PLTW");
        System.out.println(MediaLib.getOwner() + "'s Library");

        MediaLib.owner = "Woldseth";
        System.out.println(MediaLib.getOwner() + "'s Library");
    }
}
