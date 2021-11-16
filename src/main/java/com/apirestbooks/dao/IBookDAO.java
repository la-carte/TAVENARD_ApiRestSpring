package com.apirestbooks.dao;

import com.apirestbooks.model.Book;

import java.util.List;

public interface IBookDAO {
    List<Book> findAll() ;
    Book findByTitle(String title);
    Book findById(int id);
    List<Book> findAllByAuthor(String author);
    void save(Book book);
}
