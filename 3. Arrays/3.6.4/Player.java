/*
 * Activity 3.6.4
 */
class Player {
    private String name;
    private int age;

    /* constructors */
    public Player() {
        this.name = "";
        this.age = 0;
    }

    public Player(String name) {
        this.name = name;
        this.age = 0;
    }

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /* accessors */
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    /* mutators */
    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(int age) {
        this.age = age;
    }

}
