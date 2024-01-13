package com.book.store.service;

import com.book.store.dao.BookDAO;
import com.book.store.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private BookDAO bookDAO;

    @Autowired
    public BookServiceImpl(BookDAO bookDAO) {
        this.bookDAO = bookDAO;
    }

    @Override
    @Transactional
    public Book save(Book book) {
        return bookDAO.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookDAO.findAll();
    }

    @Override
    public Book findById(int id) {
        return bookDAO.findById(id).orElseThrow(() -> new RuntimeException("Book with id not found"));
    }

    @Override
    public void deleteById(int id) {
        bookDAO.deleteById(id);
    }


}
