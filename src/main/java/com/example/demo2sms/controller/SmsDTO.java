package com.example.demo2sms.controller;

import java.util.List;

public class SmsDTO {
    private  String password;
    private  String message;
    private  List<String> destinationAddresses;
    private  String applicationId;

    public SmsDTO() {
    }

    public SmsDTO(String password, String message, List<String> destinationAddresses, String applicationId) {
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

    public List<String> getDestinationAddresses() {
        return destinationAddresses;
    }

    public void setDestinationAddresses(List<String> destinationAddresses) {
        this.destinationAddresses = destinationAddresses;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }
}
