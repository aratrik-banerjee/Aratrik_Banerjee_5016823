package com.library.service;

import com.library.repository.BookRepository;
@Service
public class BookService {
    

    public BookService() {}

    @SuppressWarnings("unused")
    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public void manageBooks() {
        System.out.println("\nManaging books in the library...");
    }
}
