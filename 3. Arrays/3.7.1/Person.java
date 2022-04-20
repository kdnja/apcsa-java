import java.util.ArrayList;

public class Person {
    private String name;
    private int age;
    private int height;

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String toString() {
        return name + ": " + age + " years old, " + height + " inches";
    }

    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        myList.add(new Person("Caden", 17, 72).toString());
        myList.add(new Person("Dylan", 17, 69).toString());
        myList.add(new Person("Jordan", 17, 73).toString());

        System.out.println(myList);
    }
}
