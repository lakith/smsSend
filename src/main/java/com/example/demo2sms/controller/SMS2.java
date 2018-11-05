package com.example.demo2sms.controller;

import java.util.List;

public class SMS2 {
    private  String password;
    private  String message;
    private  String destinationAddresses;
    private  String applicationId;

    public SMS2() {
    }

    public SMS2(String password, String message, String destinationAddresses, String applicationId) {
        this.password = password;
        this.message = message;
        this.destinationAddresses = destinationAddresses;
        this.applicationId = applicationId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDestinationAddresses() {
        return destinationAddresses;
    }

    public void setDestinationAddresses(String destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
}
