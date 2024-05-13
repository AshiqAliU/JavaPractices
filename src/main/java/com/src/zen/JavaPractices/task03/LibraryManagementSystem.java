package com.src.zen.JavaPractices.task03;

import com.src.zen.JavaPractices.task03.model.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LibraryManagementSystem {

    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>(Arrays.asList(new Book(1, "ABCD", "Abcd", Boolean.TRUE),
                new Book(2, "ABCD", "Abcd", Boolean.FALSE),
                new Book(3, "ABCD", "Abcd", Boolean.TRUE)));
        Library library = new Library(books);
        library.addBook(new Book(4, "XYZ", "Xyz", Boolean.TRUE));
        library.displayBook();
        library.replaceBook(2);
        library.displayBook();
    }
}
