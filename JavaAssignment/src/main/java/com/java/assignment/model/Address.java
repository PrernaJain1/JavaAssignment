package com.java.assignment.model;

public class Address {
    private String streetName;
    private String completeAddress;
    private String pinCode;

    public String getStreetName(){
        return streetName;
    }

    public void setStreetName(String streetName){
        this.streetName = streetName;
    }

    public String getCompleteAddress(){
        return completeAddress;
    }

    public void setCompleteAddress(String completeAddress){
        this.completeAddress = completeAddress;
    }

    public String getPinCode(){
        return pinCode;
    }

    public void setPinCode(String pinCode){
        this.pinCode = pinCode;
    }
}
