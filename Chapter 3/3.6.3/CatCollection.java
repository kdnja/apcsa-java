/*
 * Activity 3.6.3
 */
public class CatCollection {
    public static void main(String[] args) {
        Cat[] cats = {new Cat("Fluffy"), new Cat("Freckles"), new Cat("Boots")};

        // for each Cat c in cats OR for each c in cats
        for (Cat c : cats) {
            System.out.println(c);
        }
    }
}
