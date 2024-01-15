package com.book.store.service;

import com.book.store.dao.MyBookDAO;
import com.book.store.entity.Book;
import com.book.store.entity.MyBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyBookServiceImpl implements MyBookService{

    private MyBookDAO myBookDAO;

    @Autowired
    public MyBookServiceImpl(MyBookDAO myBookDAO) {
        this.myBookDAO = myBookDAO;
    }

    @Override
    @Transactional
    public MyBook save(MyBook myBook) {
        return myBookDAO.save(myBook);
    }

    @Override
    public List<MyBook> findAll() {
        return myBookDAO.findAll();
    }

    @Override
    public MyBook findById(int id) {
        return myBookDAO.findById(id).orElseThrow(() -> new RuntimeException("MyBook with id: " + id + " not found"));
    }

    @Override
    public void deleteById(int id) {
        myBookDAO.deleteById(id);
    }

    @Override
    public List<Book> getAllBooks() {

        List<MyBook> myBooks = myBookDAO.findAll();
        List<Book> books = new ArrayList<>();

        for (MyBook myBook : myBooks){
            Book book = myBook.getBook();
            books.add(book);
        }

        return books;
    }
}
