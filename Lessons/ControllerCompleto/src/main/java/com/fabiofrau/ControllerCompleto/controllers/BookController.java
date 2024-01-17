package com.fabiofrau.ControllerCompleto.controllers;

import com.fabiofrau.ControllerCompleto.dto.Book;
import com.fabiofrau.ControllerCompleto.dto.BookRequest;
import com.fabiofrau.ControllerCompleto.repository.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class BookController {

    @Autowired
    Library library;

    @GetMapping(value = "/book/{id}")
    public Book getBook(@PathVariable int id) {
        for(Book book : library.getBooks()) {
            if(book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    @PutMapping(path = "/book/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody BookRequest bookRequest) {

        Book updatedBook = null;

        for(Book book : library.getBooks()) {
            if(book.getId().equals(id)) {
                book.setTitle(bookRequest.getTitle());
                book.setAuthor(bookRequest.getAuthor());
                book.setEditor(bookRequest.getEditor());
                book.setPubYear(bookRequest.getPubYear());

                updatedBook = book;
            }
        }

        return updatedBook;

    }

    @PostMapping(path="/book/{id}")
    public BookRequest insertBook(@PathVariable int id, @RequestBody BookRequest bookRequest) {

        return bookRequest;
    }

}
