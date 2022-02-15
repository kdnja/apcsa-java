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
    }
}
