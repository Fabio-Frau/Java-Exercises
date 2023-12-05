import java.util.ArrayList;

public class Library {

    private ArrayList<Book> library;

    public void printLibrary() {
        for( Book book : this.library) {
            System.out.println(book);
        }
    }

    public void addBook(Book book)  {
        this.library.add(book);
    }

    public void removeBook(Book book) {
        this.library.remove(book);
    }

    public Library(ArrayList<Book> library) {
        this.library = library;
    }

    public ArrayList<Book> getLibrary() {
        return library;
    }

    public void setLibrary(ArrayList<Book> library) {
        this.library = library;
    }
}
