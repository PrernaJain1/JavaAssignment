package com.java.assignment.model;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private int age;
    private String mobileNo;

    public int getID(){
        return id;
    }

    public void setID(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getMobileNo(){
        return mobileNo;
    }

    public void setMobileNo(String mobileNo){
        this.mobileNo = mobileNo;
    }

}
