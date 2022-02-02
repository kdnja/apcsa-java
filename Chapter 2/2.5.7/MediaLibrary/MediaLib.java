/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib {
    private static int numEntries = 0;

    private Book book;
    // added in 2.5.8
    private static int numBooks = 0;

    private Movie movie;
    // added in 2.5.8
    private static int numMovies = 0;

    // added in 2.5.8
    private Song song;
    private static int numSongs = 0;

    // added in 2.5.8
    public static String owner = "Caden";

    public void addBook(Book b) {
        if (book == null) {
            book = b;
            numEntries++;
            numBooks++;
        } else {
            System.out.println("You can only have up to one book in a library at a time.");
        }
    }

    public void changeBook(Book b) {
        if (book != null) {
            book = b;
        } else {
            System.out.println("There is no book to change.");
        }
    }

    public void addMovie(Movie m) {
        if (movie == null) {
            movie = m;
            numEntries++;
            numMovies++;
        } else {
            System.out.println("You can only have up to one movie in a library at a time.");
        }
    }

    public void changeMovie(Movie m) {
        if (movie != null) {
            movie = m;
        } else {
            System.out.println("There is no movie to change.");
        }
    }

    public void addSong(Song s) {
        if (song == null) {
            song = s;
            numEntries++;
            numSongs++;
        } else {
            System.out.println("You can only have up to one song in a library at a time.");
        }
    }

    public void changeSong(Song s) {
        if (song != null) {
            song = s;
        } else {
            System.out.println("There is no song to change.");
        }
    }

    public String toString() {
        String info = "";
        if (book != null) {
            info += book.toString();
        }
        if (movie != null) {
            info += movie.toString();
        }
        if (song != null) {
            info += movie.toString();
        }
        return info;
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

}