package com.java.assignment.service;

import com.java.assignment.model.Book;
import com.java.assignment.model.Student;

import java.util.List;

public interface Services {
    void addStudent(List<Student> list);
    void getAllStudent(List<Student> list);
    void getStudentById(List<Student> list);
    void updateStudentDetail(List<Student> list);
    void removeStudent(List<Student> list);

    void addBook(List<Book> bookList);
    void getAllBook(List<Book> bookList);
    void getBookById(List<Book> bookList);
    void updateBookDetail(List<Book> bookList);
    void removeBook(List<Book> bookList);

    void borrowBook(List<Student> list, List<Book> bookList);
}
