package ru.netology.domain;

import java.util.Objects;

public class Book extends Product {
    private String bookName;
    private String author;

    public Book(int id, String name, int price, String bookName, String author) {
        super(id, name, price);
        this.bookName = bookName;
        this.author = author;
    }
public Book(){

}

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
