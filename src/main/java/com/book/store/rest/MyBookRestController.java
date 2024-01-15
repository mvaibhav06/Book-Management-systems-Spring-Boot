package com.book.store.rest;

import com.book.store.entity.Book;
import com.book.store.entity.MyBook;
import com.book.store.service.MyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@CrossOrigin
public class MyBookRestController {

    private MyBookService myBookService;

    @Autowired
    public MyBookRestController(MyBookService myBookService) {
        this.myBookService = myBookService;
    }

    @GetMapping
    public List<MyBook> findAll(){
        return myBookService.findAll();
    }

    @PostMapping
    public MyBook addToMyBooks(@RequestBody MyBook myBook){
        return myBookService.save(myBook);
    }

    @GetMapping("/mybooks")
    public List<Book> findAllBooks(){
        return myBookService.getAllBooks();
    }

    @DeleteMapping("/{id}")
    public void deleteBookById(@PathVariable int id){
        myBookService.deleteById(id);
    }
}
