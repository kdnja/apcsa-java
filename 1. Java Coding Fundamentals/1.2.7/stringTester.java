public class stringTester {
    public static void main(String[] args) {
        String a = "horse";
        String b = "hor";

        // playing around with String methods
        System.out.println(a); // prints a
        System.out.println(b); // prints b
        System.out.println(a.compareTo(b)); // prints lexicographic difference between a and b
        System.out.println(b.compareTo(a)); // prints lexicographic difference between b and a
    }
}
