package com.example.LibraryManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        System.out.println("✅ [INFO] / endpoint was hit.");
        return """
                <h2>Welcome to the Library Management System!</h2>
                <p>Use <code>/books</code> endpoint to manage books.</p>
                <p>Database console: <a href='/h2-console' target='_blank'>H2 Console</a></p>
                """;
    }
}
