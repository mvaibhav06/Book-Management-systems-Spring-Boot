package com.book.store.rest;

import com.book.store.entity.Book;
import com.book.store.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class BookRestController {

    private BookService bookService;

    @Autowired
    public BookRestController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> findAllBooks(){
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable int id){
        return bookService.findById(id);
    }

    @PostMapping
    public Book saveBook(@RequestBody Book book){
        return bookService.save(book);
    }
}
