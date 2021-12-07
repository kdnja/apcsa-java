public class StateSong {
  public static void main(String[] args) {
    String state = new String("California"); // immutable string
    int songYear = 1913; // primitive type
    String stateSong = "I love you, " + state + ", you're the greatest state of all.";
    // += operator to concatenate strings
    stateSong += "\nI love you in the winter, summer, spring and in the fall.\nI love your fertile valleys; your dear mountains I adore.";
    // + operator to concatenate strings and integers
    System.out.println(stateSong + "\nI love your grand old ocean and I love her rugged shore.\n\nMade in " + songYear);
  }
}