package com.restwithjpa.restwithjpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.restwithjpa.restwithjpa.entities.Book;
import com.restwithjpa.restwithjpa.repository.BookRepository;

@Component
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public Book getBookById(int id) {
        Book book = null;
        book = this.bookRepository.findById(id);
        return book;
    }

    public Book getBookByName(String name) {
        return this.bookRepository.findByName(name);
    }

    public List<Book> getAllBook() {
        List<Book> list = (List<Book>) this.bookRepository.findAll();
        return list;
    }

    /**
     * @param book
     * @return
     */
    public Book insertBook(Book book) {
        Book save = this.bookRepository.save(book);
        return save;
    }

    /**
     * @param book
     * @param id
     * @return
     */
    public Book updateBook(Book book, int id) {
        book.setId(id);
        Book save = null;
        save = this.bookRepository.save(book);
        return save;
    }

    public Book deleteBookById(int id) {
        Book save = this.getBookById(id);
        this.bookRepository.deleteById(id);
        return save;
    }
}
