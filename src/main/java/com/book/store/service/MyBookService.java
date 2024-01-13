package com.book.store.service;

import com.book.store.entity.MyBook;

import java.util.List;

public interface MyBookService {

    MyBook save(MyBook myBook);

    List<MyBook> findAll();

    MyBook findById(int id);

    void deleteById(int id);
}
