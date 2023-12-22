import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Library library = new Library(new ArrayList<>());

        Book book1 = new Book("Adventures of Tom Sawyer", "Mark Twain");
        Book book2 = new Book("Ben Hur", "Lewis Wallace");
        Book book3 = new Book("Time Machine", "H.G. Wells");
        Book book4 = new Book("Anna Karenina", "Leo Tolstoy");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);

        System.out.println("Books in the library:");
        for (Book book : library.getBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());
        }

        library.removeBook(book2);
        System.out.println("\nBooks in the library after removing " + book2.getTitle() + ":");
        for (Book book : library.getBooks()) {
            System.out.println(book.getTitle() + " by " + book.getAuthor());

        }
    }
}
