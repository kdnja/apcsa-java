/*
 * Activity 3.7.2
 */
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String args[]) {
        ArrayList<String> animalList = new ArrayList<String>();
        animalList.add("Dog");
        animalList.add("Cat");
        animalList.add("Rabbit");
        animalList.add("Frog");
        animalList.add("Horse");
        animalList.add("Cow");

        // displaying elements
        System.out.println(animalList);

        /* your code here */ // adds "bird" to the end of the list
        animalList.add("Bird");
        animalList.add(3, "Snake"); // adds "snake" in the fourth position in the list
        System.out.println(animalList.get(1)); // gets the second item in the list
        System.out.println(animalList.get(2)); // gets the third item in the list
        System.out.println(animalList.get(4)); // gets the fifth item in the list
        animalList.remove(4);
        // display elements
        System.out.println(animalList);
        System.out.println(animalList.size());
    }
}
