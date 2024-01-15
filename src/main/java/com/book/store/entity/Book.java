package com.book.store.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "author")
    private String author;

    @Column(name = "price")
    private int price;

    @OneToOne(mappedBy = "book", fetch = FetchType.LAZY)
    @JsonIgnore
    private MyBook myBook;

    public Book() {
    }

    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public MyBook getMyBook() {
        return myBook;
    }

    public void setMyBook(MyBook myBook) {
        this.myBook = myBook;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
