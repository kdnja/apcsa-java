
/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */
import java.util.Scanner;

public class Player {
    /* attributes */

    private String name;
    private int points;

    /* constructor(s) */

    public Player() {
        name = "";
        points = 0;

        System.out.println("Name: ");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.println("Welcome, " + name + "!");
    }

    public Player(String inputName) {
        name = inputName;
        points = 0;

        System.out.println("Welcome, " + name + "!");
    }

    /* accessor(s) */

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    /* mutator(s) */

    public void setName(String name) {
        this.name = name;
    }

    public void addToPoints(int value) {
        points += value;
    }
}
