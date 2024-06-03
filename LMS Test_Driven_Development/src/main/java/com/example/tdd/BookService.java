package com.example.tdd;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BookService {
    private IBookRepository bookRepository;

    public BookService(IBookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooksByAuthor(String author) {
        try {
            return bookRepository.findAllBooks().stream()
                    .filter(book -> book.getAuthor().equalsIgnoreCase(author))
                    .collect(Collectors.toList());
        } catch (NullPointerException e) {
            return Collections.emptyList();
        }
    }

    public List<Book> getBookByTitle(String title) {
        try {
            return bookRepository.findAllBooks().stream()
                    .filter(book -> book.getTitle().equalsIgnoreCase(title))
                    .collect(Collectors.toList());
        } catch (NullPointerException e) {
            return Collections.emptyList();
        }
    }

    public List<Book> getBookByTitleAndAuthor(String title, String author) {
        try {
            return bookRepository.findAllBooks().stream()
                    .filter(book -> book.getTitle().equalsIgnoreCase(title) && book.getAuthor().equalsIgnoreCase(author))
                    .collect(Collectors.toList());
        } catch (NullPointerException e) {
            return Collections.emptyList();
        }
    }
}
