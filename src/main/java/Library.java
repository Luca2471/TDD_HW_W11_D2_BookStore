import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> collectionOfBooks;

    public Library(int capacity) {
        this.capacity = capacity;
        this.collectionOfBooks = new ArrayList<Book>();
    }

    public ArrayList<Book> getBooks() {
        return new ArrayList<Book>(collectionOfBooks);
    }

    public int bookCount() {
        return this.collectionOfBooks.size();
    }

    public void addBook(Book book) {
        if (this.bookCount() < this.capacity) {
            this.collectionOfBooks.add(book);
        }
    }

}
