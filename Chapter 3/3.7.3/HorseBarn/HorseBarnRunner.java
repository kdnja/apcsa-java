/*
 * Activity 3.7.3
 */
import java.util.ArrayList;

public class HorseBarnRunner {
    public static void main(String[] args) {
        HorseBarn barn = new HorseBarn();
        ArrayList<Horse> barnSpaces = new ArrayList<Horse>();
        barnSpaces = barn.getSpaces();

        for (Horse h : barnSpaces) {
            System.out.println(h);
            // ConcurrentModificationException error: cannot change the size of an ArrayList while
            // traversing it with an enhanced for loop
            // @formatter:off
            /* if (h.getName().equals("Patches")) {
                barnSpaces.remove(h);
            } */
            // @formatter:on
        }

        // @formatter:off
        /* for (int i = 0; i < barnSpaces.size(); i++) {
            Horse h = barnSpaces.get(i);
            if (h.getName().equals("Patches")) {
                System.out.println("Bye bye " + barnSpaces.remove(i));
                i--;
            } else if (h.getName().equals("Lady")) {
                System.out.println("Bye bye " + barnSpaces.remove(i));
                i--;
            }
        } */
        // @formatter:on

        int i = 0;
        while (i < barnSpaces.size()) {
            Horse h = barnSpaces.get(i);
            if (h.getName().equals("Patches")) {
                System.out.println("Bye bye " + barnSpaces);
            } else if (h.getName().equals("Lady")) {
                System.out.println("Bye bye " + barnSpaces.remove(i));
            }
            i++;
        }

        for (Horse h : barnSpaces) {
            System.out.println(h);
        }

        // Avg weight of horses
        int totalWeight = 0;
        for (Horse h : barnSpaces) {
            int curWeight = h.getWeight();
            totalWeight += curWeight;
        }
        int avgWeight = totalWeight / barnSpaces.size();
        System.out.println("Average weight: " + avgWeight);

        System.out.println();

        // Display horses that weigh more than avg by name and weight
        System.out.println("Horses weighing more than average:");
        for (Horse h : barnSpaces) {
            int curWeight = h.getWeight();
            if (curWeight > avgWeight) {
                System.out.println(h.getName() + ", " + h.getWeight());
            }
        }

        System.out.println();

        // Display lightest horse and heaviest horse by name and weight
        Horse lightestHorse = barnSpaces.get(0);
        Horse heaviestHorse = barnSpaces.get(0);

        for (Horse h : barnSpaces) {
            if (lightestHorse.getWeight() > h.getWeight()) {
                lightestHorse = h;
            }
            if (heaviestHorse.getWeight() < h.getWeight()) {
                heaviestHorse = h;
            }
        }
        System.out.println("Heaviest horse: " + heaviestHorse + " at " + heaviestHorse.getWeight());
        System.out.println("Lightest horse: " + lightestHorse + " at " + lightestHorse.getWeight());

        System.out.println();

        // Traversal for three tasks
        for (int j = 0; j < barnSpaces.size(); j++) {
            Horse h = barnSpaces.get(j);
            // Duke leaves the barn and a new Horse ("Princess", 1445) takes his place
            if (h.getName().equals("Duke")) {
                Horse princess = new Horse("Princess", 1445);
                barnSpaces.remove(j);
                barnSpaces.add(j, princess);
            }

            // A new owner wants their new Horse ("Chief", 1505) to be next to (after) Silver
            if (h.getName().equals("Silver")) {
                Horse chief = new Horse("Chief", 1505);
                barnSpaces.add(j + 1, chief);
            }

            // A new owner wants two new horses, new Horse ("Gypsy", 1335) and new Horse ("Magic",
            // 1425), on either side of Buddy
            if (h.getName().equals("Buddy")) {
                Horse gypsy = new Horse("Gypsy", 1335);
                Horse magic = new Horse("Magic", 1425);
                barnSpaces.add(j, gypsy);
                barnSpaces.add(j + 2, magic);
                j += 1;
            }
        }

        // Adds formatting and textual descriptions like the PLTW lesson for consistency
        System.out.println("Added and deleted:");
        for (Horse h : barnSpaces) {
            System.out.println(h.getName() + ": " + h.getWeight());
        }

        if (barnSpaces.size() % 2 == 0) {
            for (int j = 0; j < barnSpaces.size(); j += 2) {
                Horse horse1 = barnSpaces.get(j);
                Horse horse2 = barnSpaces.get(j + 1);
                System.out.println(horse1.getName() + " and " + horse2.getName());
            }
        } else if (barnSpaces.size() % 2 == 1) {
            for (int j = 0; j < barnSpaces.size() - 2; j += 2) {
                Horse horse1 = barnSpaces.get(j);
                Horse horse2 = barnSpaces.get(j + 1);
                System.out.println(horse1.getName() + " and " + horse2.getName());
            }
            Horse loneHorse = barnSpaces.get(barnSpaces.size() - 1);
            System.out.println("Sadly, " + loneHorse.getName() + " has no partner...");
        }
    }
}
