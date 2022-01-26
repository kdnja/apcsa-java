/*
 * Activity 2.5.7
 * 
 * The runner for the MediaLibrary program
 */
public class MediaLibRunner {
    public static void main(String[] args) {
        System.out.println("Welcome to your Media Library");
        // creates a new media library
        MediaLib myLib = new MediaLib();
        // lists books in library before books are added
        System.out.println("Library:\n" + myLib);
        // creates a new book
        Book myBook = new Book("The Lord of the Rings", "Tolkien");
        // prints out confirmation of book creation
        System.out.println("Book created " + myBook);
        // adds book to media library
        myLib.addBook(myBook);
        // lists books in library after books are added
        // System.out.println("Library:\n" + myLib);

    }
}