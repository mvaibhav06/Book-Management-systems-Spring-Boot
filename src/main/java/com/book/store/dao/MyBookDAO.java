package com.book.store.dao;

import com.book.store.entity.MyBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookDAO extends JpaRepository<MyBook, Integer> {
}
