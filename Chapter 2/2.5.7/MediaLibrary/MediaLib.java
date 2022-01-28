/**
 * Activity 2.5.7
 * 
 * A MediaLib class for the MediaLibrary program
 */
public class MediaLib {
    private Book book;

    public void addBook(Book b) {
        /* 
        formal parameter "b" refers to the same object in memory
        changes to the object in one class will be seen by another
        */
        book = b;
    }

    public String toString() {
        String info = "";
        if (book != null) {
            info += book.toString();
        }
        return info;
    }

    // Modifying via a Formal Parameter
    // void testBook(Book tester) {
    //     tester.setTitle(book.getTitle());
    //     System.out.println(tester);
    // }
}