
/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner {
    public static void main(String[] arg) {
        Library library = new Library();
        ArrayList<Book> childrensBooks = library.getChildrensBooks();
        String authorToFind = "L. Frank Baum";
        String bookToFind = "Sky Island";
        double minimumRating = 0.0;

        for (Book book : childrensBooks) {
            String author = book.getAuthor();
            if (author.equals(authorToFind)) {
                System.out.println(book);
            }
        }

        for (Book book : childrensBooks) {
            String title = book.getTitle();
            double rating = book.getRating();
            if (title.equals(bookToFind)) {
                minimumRating = rating;
            }
        }

        System.out.println();

        for (Book book : childrensBooks) {
            double rating = book.getRating();
            if (rating >= minimumRating) {
                System.out.println(book);
            }
        }
    }
}
