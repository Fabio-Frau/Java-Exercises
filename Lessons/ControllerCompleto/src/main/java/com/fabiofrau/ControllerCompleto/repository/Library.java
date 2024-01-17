package com.fabiofrau.ControllerCompleto.repository;

import com.fabiofrau.ControllerCompleto.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Component
public class Library {


    public ArrayList<Book> getBooks() {

        ArrayList<Book> books = new ArrayList<>();

        Book book1 = new Book(1, "Libro1", "Autore1", "Editore1", 2000);
        Book book2 = new Book(2, "Libro2", "Autore2", "Editore2", 2001);
        Book book3 = new Book(3, "Libro3", "Autore3", "Editore3", 2002);
        Book book4 = new Book(4, "Libro4", "Autore4", "Editore4", 2003);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);

        return books;

    }


}
