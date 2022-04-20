/******************************************
 * Sample Solution for Activity 3.6.3
 *****************************************/
public class Cat {
    private String name;
    private double age;

    public Cat() {
        name = "";
        age = 0;
    }

    public Cat(String n) {
        name = n;
        age = 0;
    }

    public Cat(String n, double a) {
        name = n;
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double a) {
        age = a;
    }

    public void eat(String food) {
        System.out.println("I eat " + food + ".");
    }

    public void play(String toy) {
        System.out.println("Oh boy! I get to play with my " + toy + "!");
    }

    public String toString() {
        return name + ", " + age + " years old";
    }
}
