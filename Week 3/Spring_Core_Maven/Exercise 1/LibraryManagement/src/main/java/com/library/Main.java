//package com.library;
//
//import com.library.service.BookService;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
//public class Main {
//    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        BookService bookService = (BookService) context.getBean("bookService");
//        bookService.showBooks();
//    }
//}

package com.library;

import com.library.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Load Spring application context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the bookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Call a method to verify DI worked
        bookService.showBooks();
    }
}

