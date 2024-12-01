package com.java.assignment.controllers;

import com.java.assignment.model.Address;
import com.java.assignment.model.Book;
import com.java.assignment.model.Student;
import com.java.assignment.service.ServiceImplementation;
import com.java.assignment.service.Services;

import java.util.ArrayList;
import java.util.List;

public class Manager {

    public static void main(String []args){
        List<Student> students = new ArrayList<>();
        List<Book> books = new ArrayList<>();
        List<Address> addresses = new ArrayList<>();
        Services services = new ServiceImplementation();

        //Adding student 1
        services.addStudent(students);

        //Adding student 2
        services.addStudent(students);
        services.getAllStudent(students);

        //get student by id
        services.getStudentById(students);

        //Updating student details
        services.updateStudentDetail(students);

        //removing and getting remaining list of students
        services.removeStudent(students);
        services.getAllStudent(students);

        //Book

        //Adding books
        services.addBook(books);
        services.addBook(books);

        //Get data of books
        services.getAllBook(books);

        //Get book by id
        services.getBookById(books);

        //Updating data
        services.updateBookDetail(books);

        //removing book
        services.removeBook(books);
        services.getAllBook(books);


        services.borrowBook(students, books);
        services.getAllBook(books);
    }
}
