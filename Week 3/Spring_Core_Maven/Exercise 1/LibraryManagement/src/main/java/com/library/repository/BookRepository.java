package com.library.repository;

import java.util.Arrays;
import java.util.List;

public class BookRepository {

    public List<String> getAllBooks() {
        return Arrays.asList("1984", "Brave New World", "The Catcher in the Rye");
    }
}
