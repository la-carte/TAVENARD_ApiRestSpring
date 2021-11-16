package com.apirestbooks.web.contoller;


import com.apirestbooks.dao.IBookDAO;
import com.apirestbooks.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private IBookDAO dao;

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return dao.findAll();
    }

    @GetMapping("/books/id/{id}")
    public Book getAllBooks(@PathVariable int id){
        return dao.findById(id);
    }

    @GetMapping("/books/title/{title}")
    public Book getBook(@PathVariable String title){
        return dao.findByTitle(title);
    }
    @GetMapping("/books/author/{author}")
    public List<Book> getAuthorBooks(@PathVariable String author){
        return dao.findAllByAuthor(author);
    }

    @PostMapping("books")
    public void addBook(@RequestBody Book book){
        dao.save(new Book(book.getTitle(),book.getAuthor(),book.getText()));
    }

    @PutMapping("books/title/{title}")
    public Book replaceBook(@RequestBody Book book,@PathVariable String title){
        Book b = getBook(title);
        b.setTitle(book.getTitle());
        b.setAuthor(book.getAuthor());
        b.setText(book.getText());
        return b;
    }
}
