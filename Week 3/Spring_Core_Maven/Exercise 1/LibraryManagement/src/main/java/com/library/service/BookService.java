//package com.library.service;
//
//import com.library.repository.BookRepository;
//
//public class BookService {
//
//    private BookRepository bookRepository;
//
//    // Setter for Spring DI
//    public void setBookRepository(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
//
//    public void showBooks() {
//        System.out.println("Books in Library:");
//        bookRepository.getAllBooks().forEach(System.out::println);
//    }
//}
package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    // Setter method for Spring Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void showBooks() {
        System.out.println("Books available in library:");
        bookRepository.getAllBooks().forEach(System.out::println);
    }
}
