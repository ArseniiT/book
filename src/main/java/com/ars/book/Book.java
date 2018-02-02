package com.ars.book;

import javax.persistence.*;

/**
 * Created by DELL on 2/1/2018.
 */
@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String title;
    private String description;
    private String author;
    private String isbn;

    @Column(name = "print_year")
    private int printYear;

    @Column(name = "read_already")
    private int readAlready; // 0 is false, 1 is true

    public Book() {
    }

    public Book(String title, String description, String author, String isbn, int printYear, int readAlready) {
        this.title = title;
        this.description = description;
        this.author = author;
        this.isbn = isbn;
        this.printYear = printYear;
        this.readAlready = readAlready;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPrintYear() {
        return printYear;
    }

    public void setPrintYear(int printYear) {
        this.printYear = printYear;
    }

    public int getReadAlready() {
        return readAlready;
    }

    public void setReadAlready(int readAlready) {
        this.readAlready = readAlready;
    }
}
