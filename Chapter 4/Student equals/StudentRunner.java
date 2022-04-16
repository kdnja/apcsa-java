/*
 * Activity 4.9.7
 */
public class StudentRunner {
    public static void main(String args[]) {
        // Create new Student objects
        Student s = new Student("TestName", 0, 0);
        Student t = new Student("Testname", 0, 0);
        Student r = new Student("New Name", 0, 0);

        // Below two statements are equivalent
        System.out.println(s.equals(t));
        System.out.println(s.equals(r));
    }
}
