package com.apirestbooks.dao;

import com.apirestbooks.model.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class BookDAO implements IBookDAO{
    private List<Book> books;

    public BookDAO() {
        books = new ArrayList<>();
    }

    @Override
    public List<Book> findAll() {
        return books;
    }

    @Override
    public Book findByTitle(String title) {
        for (Book b : books) {
            if(b.getTitle().equals(title)){
                return b;
            }
        }
        return new Book();
    }

    @Override
    public List<Book> findAllByAuthor(String author) {
        List<Book> l= new ArrayList<>();
        for (Book b : books) {
            if(b.getAuthor().equals(author)){
                l.add(b);
            }
        }
        if(l.isEmpty()){
            l.add(new Book());
        }
        return l;
    }

    @Override
    public Book findById(int id) {
        for (Book b: books) {
            if(b.getId() == id){
                return b;
            }
        }
        return new Book();
    }

    @Override
    public void save(Book book) {
        books.add(book);
    }


}
