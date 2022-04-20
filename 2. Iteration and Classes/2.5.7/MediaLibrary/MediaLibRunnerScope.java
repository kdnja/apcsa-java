/*
 * Activity 2.5.9
 */
public class MediaLibRunnerScope {
    public static void main(String[] args) {
        MediaLib myLib = new MediaLib();
        myLib.addMovie(new Movie("Raiders of the Lost Ark", 1.9));
        myLib.addBook(new Book("1984", "Orwell"));
        myLib.addSong(new Song("In Your Eyes", 0));
        System.out.println(MediaLib.getOwner() + "'s Library:\n" + myLib);
    }
}
