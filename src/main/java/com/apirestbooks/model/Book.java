package com.apirestbooks.model;


public class Book {
    private static int nbBook = 0;
    private int id;
    private String title;
    private String author;
    private String text;
    public Book() {
        this.id = 0;
        this.title = "sorry";
        this.author = "no";
        this.text = "book";

    }

    public Book(String title, String author, String text) {
        this.id = ++ nbBook;
        this.title = title;
        this.author = author;
        this.text = text;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }
}
