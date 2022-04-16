/*
 * Activity 4.9.7
 */
public class Student {
    // Instance variables
    String name = "";
    int id = 0;
    int grade = 0;

    // Constructor
    Student(String inputName, int inputId, int inputGrade) {
        name = inputName;
        id = inputId;
        grade = inputGrade;
    }

    // Override toString() method
    public String toString() {
        return ("Name: " + name + "\nID: " + id + "\nGrade: " + grade);
    }

    // Override equals() method
    public boolean equals(Student s) {
        return (this.id == s.id);
    }

}
