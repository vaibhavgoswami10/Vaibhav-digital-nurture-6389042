//package com.library.service;
//
//import com.library.repository.BookRepository;
//
//public class BookService {
//    private BookRepository bookRepository;
//
//    // Setter for Dependency Injection
//    public void setBookRepository(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
//
//    public void displayBooks() {
//        System.out.println("Displaying books from service...");
//        bookRepository.listBooks();
//    }
//}
package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    private String serviceName;

    // Constructor for constructor injection
    public BookService(String serviceName) {
        this.serviceName = serviceName;
        System.out.println("Constructor Injection: serviceName = " + serviceName);
    }

    // Setter for setter injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("Setter Injection: BookRepository injected");
    }

    public void displayBooks() {
        System.out.println("[" + serviceName + "] Displaying books...");
        bookRepository.listBooks();
    }
}
