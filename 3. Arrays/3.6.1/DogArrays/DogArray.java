/*
 * Activity 3.6.1
 */
public class DogArray {
    public static void main(String[] args) {
        Dog[] myDogs = {new Dog("Sally"), new Dog("Daisy"), new Dog("Joe")};
        // Each element is null in neighborsDogs; no objects have been created yet
        Dog[] neighborsDogs = new Dog[2];

        System.out.println(myDogs[0].getName());
        System.out.println(myDogs[1].getName());
        System.out.println(myDogs[2].getName());

        neighborsDogs[0] = new Dog("Barry");
        neighborsDogs[1] = new Dog("Dave");

        System.out.println(neighborsDogs[0].getName());
        System.out.println(neighborsDogs[1].getName());

        // Initializer lists can only be used when you create the array at declaration time.

        // ERROR: Array constants can only be used in initializers
        // neighborsDogs = {new Dog("Cinnamon"), new Dog("Mocha")};

        // The size of an array is established at the time of creation and cannot be changed.

        // ERROR: Index 2 out of bounds for length 2
        // neighborsDogs[2] = new Dog("Cocoa");

        // ERROR: Cannot invoke "Dog.getName()" because "neighborsDogs[0]" is
        neighborsDogs = new Dog[3];
        System.out.println(neighborsDogs[0].getName());
        System.out.println(neighborsDogs[1].getName());

        // Java does not provide a mechanism for removing elements of an array, but you can assign a
        // null value.
        myDogs[2] = null; // gave my puppy to my neighbor!
    }
}
