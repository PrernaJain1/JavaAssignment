package com.java.assignment.service;

import com.java.assignment.model.Address;
import com.java.assignment.model.Book;
import com.java.assignment.model.Student;

import java.util.List;
import java.util.Scanner;

public class ServiceImplementation implements Services {

    Student student;
    Book book;
    Address address;
    Scanner sc;


    @Override
    public void addStudent(List<Student> list) {
        student = new Student();
        sc = new Scanner(System.in);
        System.out.println("Enter student id:");
        int sid = sc.nextInt();
        student.setID(sid);
        System.out.println("Enter student name:");
        String sname = sc.next();
        student.setName(sname);
        System.out.println("Enter student age:");
        int sage = sc.nextInt();
        student.setAge(sage);
        System.out.println("Enter student mobile number:");
        String sphone = sc.next();
        student.setMobileNo(sphone);

        list.add(student);
    }

    @Override
    public void getAllStudent(List<Student> list) {
        int size = list.size();
       for(Student s: list){
           System.out.println("Student Id : " +s.getID());
           System.out.println("Student Name : " +s.getName());
           System.out.println("Student Age : " +s.getAge());
           System.out.println("Student Mobile Number : " +s.getMobileNo());
       }
    }

    @Override
    public void getStudentById(List<Student> list) {
        System.out.println("Enter the id of student to get the details");
        int idForDetails = sc.nextInt();
        int cnt =0;
        int size = list.size(); //Size of list
        for(int i=0;i<size;i++){
            int allId = list.get(i).getID();
            System.out.println(allId);
            if(allId == idForDetails){
                cnt =1;
                System.out.println("Student Id : " +list.get(i).getID());
                System.out.println("Student Name : " +list.get(i).getName());
                System.out.println("Student Age : " +list.get(i).getAge());
                System.out.println("Student Mobile Number : " +list.get(i).getMobileNo());
                break;
            }
        }
        if(cnt==0){
            System.out.println("Please Enter correct id");
        }

    }

    @Override
    public void updateStudentDetail(List<Student> list) {
        System.out.println("Enter the id of the student for which you want to update details");
        int idToUpdateDetails = sc.nextInt();
        int size = list.size();
        int cnt =0;
        for(int i=0;i<size;i++){
            int allId = list.get(i).getID();
            if(allId == idToUpdateDetails){
                cnt =1;
                System.out.println("Enter the detail that need to be updated:");
                System.out.println("Press 1 to update name");
                System.out.println("Press 2 to update age");
                System.out.println("Press 3 to update mobileNumber");
                int detailToUpdate = sc.nextInt();

                switch (detailToUpdate) {
                    case 1:
                        System.out.println("Enter new name:");
                        String name = sc.next();
                        list.get(i).setName(name);
                        break;
                    case 2:
                        System.out.println("Enter new age:");
                        int age = sc.nextInt();
                        list.get(i).setAge(age);
                        break;
                    case 3:
                        System.out.println("Enter new mobile number:");
                        String mobileNumber = sc.next();
                        list.get(i).setMobileNo(mobileNumber);
                        break;
                    default:
                        System.out.println("Press choose correct option");
                        break;
                }
                break;
            }
        }
        if(cnt == 0){
            System.out.println("Enter correct id");
        }
    }

    @Override
    public void removeStudent(List<Student> list) {
        System.out.println("Enter the id of the student you want to remove");
        int idToRemove = sc.nextInt();
        int size = list.size();
        int cnt=0;
        for(int i= 0;i<size;i++){
            int allId = list.get(i).getID();
            if(allId == idToRemove){
                cnt =1;
                System.out.println("Student data deleted for id :" + list.remove(i).getID());
                break;
            }
        }
        if(cnt == 0){
            System.out.println("Enter correct id");
        }
    }

    @Override
    public void addBook(List<Book> bookList) {
        book = new Book();
        System.out.println("Enter book id");
        int bookId = sc.nextInt();
        book.setBookID(bookId);
        System.out.println("Enter subject");
        String subject = sc.next();
        book.setSubject(subject);
        System.out.println("Enter book count");
        int bookCount = sc.nextInt();
        book.setBookCount(bookCount);

        bookList.add(book);
    }

    @Override
    public void getAllBook(List<Book> bookList) {
        for(Book book : bookList){
            System.out.println("Book id is :" + book.getBookID());
            System.out.println("Subject is :" + book.getSubject());
            System.out.println("Book count is :" + book.getBookCount());
        }
    }

    @Override
    public void getBookById(List<Book> bookList) {
        System.out.println("Enter the book id for which required book list :");
        int idForBook = sc.nextInt();
        int size = bookList.size();
        int cnt =0;
        for(int i=0;i<size;i++){
            if(bookList.get(i).getBookID() == idForBook){
                cnt =1;
                System.out.println("Book id is : " + bookList.get(i).getBookID());
                System.out.println("Subject is : " + bookList.get(i).getSubject());
                System.out.println("Book count is : "+ bookList.get(i).getBookCount());
                break;
            }
        }
        if(cnt==0){
            System.out.println("Enter correct book id");
        }
    }

    @Override
    public void updateBookDetail(List<Book> bookList) {
        System.out.println("Enter the id of the book for which you want to update details");
        int idToUpdateDetails = sc.nextInt();
        int size = bookList.size();
        int cnt =0;
        for(int i=0;i<size;i++){
            int allId = bookList.get(i).getBookID();
            if(allId == idToUpdateDetails){
                cnt =1;
                System.out.println("Enter the detail that need to be updated:");
                System.out.println("Press 1 to update subject");
                System.out.println("Press 2 to update book count");
                int detailToUpdate = sc.nextInt();

                switch (detailToUpdate) {
                    case 1:
                        System.out.println("Enter new subject:");
                        String subjectName = sc.next();
                        bookList.get(i).setSubject(subjectName);
                        break;
                    case 2:
                        System.out.println("Enter new book count:");
                        int bookCount = sc.nextInt();
                        bookList.get(i).setBookCount(bookCount);
                        break;
                    default:
                        System.out.println("Press choose correct option");
                        break;
                }
                break;
            }
        }
        if(cnt == 0){
            System.out.println("Enter correct id");
        }
    }

    @Override
    public void removeBook(List<Book> bookList) {
        System.out.println("Enter the book id for which book to be removed:");
        int idForBookRemove = sc.nextInt();
        int size = bookList.size();
        int cnt =0;
        for(int i=0;i<size;i++) {
            if (bookList.get(i).getBookID() == idForBookRemove) {
                cnt = 1;
                System.out.println("Book id removed :"+ bookList.remove(i).getBookID());
                break;
            }
        }
        if(cnt==0){
            System.out.println("Enter correct id");
        }
    }

    @Override
    public void borrowBook(List<Student> list, List<Book> bookList) {
        System.out.println("Enter the student id from which you want to borrow book: ");
        int studentId = sc.nextInt();

        System.out.println("Enter the book subject want to borrow :");
        String subject = sc.next();
        int bookCount;

        for(Book b : bookList){
            if(b.getSubject().equals(subject)){
                bookCount =b.getBookCount()-1;
                b.setBookCount(bookCount);
                break;
            }
        }
    }
}
