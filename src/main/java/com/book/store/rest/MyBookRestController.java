package com.book.store.rest;

import com.book.store.entity.MyBook;
import com.book.store.service.MyBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
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
}
