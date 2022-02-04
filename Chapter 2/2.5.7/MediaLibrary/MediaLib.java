/*
 * Activity 2.5.9
 */
public class MediaLib {
    public static String owner = "Caden";

    private static int numEntries;
    private static int numBooks;
    private static int numMovies;
    private static int numSongs;

    private Book book;
    private Movie movie;
    private Song song;
    private String date;

    public MediaLib() {
        date = LastModified.dateAndTime();
        System.out.println("Last modified: " + date);
    }

    public void addBook(Book b) {
        if (book == null) {
            book = b;
            numEntries++;
            numBooks++;
            date = LastModified.dateAndTime();
        } else
            System.out.println("Cannot add a new book: A book already exists");
    }

    public void changeBook(Book b) {
        if (book != null) {
            book = b;
            date = LastModified.dateAndTime();
            System.out.println("Last modified: " + date);
        } else {
            System.out.println("There is no book to change.");
        }
    }

    public void addMovie(Movie m) {
        if (movie == null) {
            movie = m;
            numEntries++;
            numMovies++;
            date = LastModified.dateAndTime();
            System.out.println("Last modified: " + date);
        } else
            System.out.println("Cannot add a new movie: A movie already exists");
    }

    public void changeMovie(Movie m) {
        if (movie != null) {
            movie = m;
            date = LastModified.dateAndTime();
            System.out.println("Last modified: " + date);
        } else {
            System.out.println("There is no movie to change.");
        }
    }

    public void addSong(Song s) {
        if (song == null) {
            song = s;
            numEntries++;
            numSongs++;
            date = LastModified.dateAndTime();
            System.out.println("Last modified: " + date);
        } else
            System.out.println("Cannot add a new song: A song already exists");
    }

    public void changeSong(Song s) {
        if (song != null) {
            song = s;
            date = LastModified.dateAndTime();
            System.out.println("Last modified: " + date);
        } else {
            System.out.println("There is no song to change.");
        }
    }

    public static String getOwner() {
        return owner;
    }

    public static void changeOwner(String o) {
        owner = o;
    }

    public static int getNumEntries() {
        return numEntries;
    }

    public static int getNumBooks() {
        return numBooks;
    }

    public static int getNumMovies() {
        return numMovies;
    }

    public static int getNumSongs() {
        return numSongs;
    }

    public String toString() {
        String info = "";

        if (book != null)
            info += "Book: " + book + "\n";
        if (movie != null)
            info += "Movie: " + movie + "\n";
        if (song != null)
            info += "Song: " + song + "\n";

        return info;
    }
}