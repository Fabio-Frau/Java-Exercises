import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Book book1 = new Book("The Lord of The Rings", "Tolkien", "isbn123456");
        Book book2 = new Book("The Price of Inequality", "Stiglitz", "isbn999999");

        Library library = new Library(new ArrayList<Book>());
        library.printLibrary();
        System.out.println();

        library.addBook(book1);
        library.addBook(book2);
        library.printLibrary();
        System.out.println();

        library.removeBook(book1);
        library.printLibrary();



    }

}
