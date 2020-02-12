import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;
    Book book4;

    @Before
    public void before() {
        library = new Library(3);
        book1 = new Book("Heart of Darkness", "Joseph Conrad", "Novella");
        book2 = new Book("all quiet on the western front", "Erich Maria Remarque", "Novel");
        book3 = new Book("Dracula", "Bram Stoker", "Gothic horror");
        book4 = new Book("Call of Cthulhu", "H.P.Lovecraft", "Short Story");
    }

    @Test
    public void canAddBook() {
        library.addBook(book1);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cantAddMoreThenCapacity() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        assertEquals(3, library.bookCount());
    }

}
