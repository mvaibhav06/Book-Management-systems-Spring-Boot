package com.book.store.service;

import com.book.store.entity.Book;

import java.util.List;

public interface BookService {

    Book save(Book book);

    List<Book> getAll();

    Book findById(int id);

    void deleteById(int id);


}
