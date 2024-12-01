package com.java.assignment.model;

import java.util.List;

public class Book {
    private int bookID;
    private String subject;
    private int bookCount;

    public int getBookID(){
        return bookID;
    }

    public void setBookID(int bookID){
        this.bookID = bookID;
    }

    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public int getBookCount(){
        return bookCount;
    }

    public void setBookCount(int bookCount){
        this.bookCount = bookCount;
    }
}
