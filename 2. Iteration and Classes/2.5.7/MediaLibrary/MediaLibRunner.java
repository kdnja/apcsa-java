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
        // creates a new book (object reference)
        Book myBook = new Book("The Lord of the Rings", "Tolkien");
        // prints out confirmation of book creation
        System.out.println("Book created: " + myBook);
        // adds book to media library
        myLib.addBook(myBook);
        // lists books in library after books are added
        System.out.println("Library:\n" + myLib);

        /* demonstrating call by value */
        int myRating = 5;
        myBook.adjustRating(myRating);
        System.out.println(myBook);

        /* object reference parameters */
        myBook.setTitle("Harry Potter and the Sorcerer's Stone");
        System.out.println("Book:" + myBook);
        System.out.println("Library: " + myLib);
        myBook.setAuthor("J.K. Rowling");
        System.out.println("Book:" + myBook);
        System.out.println("Library: " + myLib);

        /* BookAlgorithm */
        System.out.println("\nYou have a NEW Library");
        MediaLib myLib2 = new MediaLib();
        // instantiates a new book named newBook
        Book newBook = new Book("To Kill a Mockingbird", "Lee");
        // adds newBook to myLib2 as an object
        myLib2.addBook(newBook);
        System.out.println("Library: " + myLib2);
        System.out.println("Book: " + newBook);
        // change value of newBook
        newBook = new Book("1984", "Orwell");
        // newBook was changed, but it does not affect the object stored in myLib
        System.out.println("Library: " + myLib2);
        System.out.println("Book: " + newBook);

        /* Modifying via a Formal Parameter */
        // System.out.println("before test: " + newBook);
        // myLib.testBook(newBook);
        // System.out.println("after test: " + newBook);

        // Matching Object Types in a Method
        Book newBook2 = new Book("1984", "Orwell");
        System.out.println(newBook.equals(newBook2));
        newBook2.setAuthor("Joe Mama");
        System.out.println(newBook.equals(newBook2));

        // MediaLibRunner class does not have direct access to Book's private data
        // System.out.println(newBook2.title);

        /* Movie class */
        Movie movie = new Movie("The Wizard of Oz", 1.7);
        System.out.println(movie);
        Movie movie2 = new Movie("The Wizard of Oz", 1.7);
        System.out.println(movie2);
        System.out.println(movie.equals(movie2));
        movie2.setDuration(1.71);
        System.out.println(movie.equals(movie2));

        /* 2.5.8 */
        System.out.println(myLib);
        // myLib2.addMovie(movie);
        System.out.println(myLib2);
        // calls total number of entries in each library
        System.out.println(MediaLib.getNumEntries());

        // Testing addBook & changeBook
        System.out.println("Second library: " + myLib2);
        myLib2.changeBook(myBook);
        System.out.println("Second library: " + myLib2);

    }
}