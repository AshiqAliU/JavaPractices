package com.src.zen.JavaPractices.task03;

import com.src.zen.JavaPractices.task03.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final ArrayList<Book> books;

    public Library(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void replaceBook(int bookID) {
        for (int i = 0; i < books.size(); i++) {
            if (bookID == books.get(i).getBookID()) {
                books.remove(i);
            }
        }
    }

    public void displayBook() {
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).toString());
        }
        System.out.println("******************");
    }

}
