package com.example.demo2sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sms")
public class SMSController {
    @Autowired
    SMSService smssErvice;

    @GetMapping("sendSms")
    public ResponseEntity<?> sendSms(){
        smssErvice.sendSMS();
        System.out.println("1 function");
        return new ResponseEntity<>("success",HttpStatus.OK);
    }

    @GetMapping("sendSms2")
    public ResponseEntity<?> sendSms2() {
        smssErvice.sendSms2();
        System.out.println("2 function");
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @GetMapping("sendSms3")
    public ResponseEntity<?> sendSms3() {
        smssErvice.smsSend3();
        System.out.println("3 function");
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @GetMapping("sendSms4")
    public ResponseEntity<?> sendSms4() {
        smssErvice.smsSend4();
        System.out.println("4 function");
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @GetMapping("sendSms5")
    public ResponseEntity<?> sendSms5() throws Exception {
        smssErvice.sendRequest();
        System.out.println("4 function");
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

    @GetMapping("sendSms6")
    public ResponseEntity<?> sendSms6() throws Exception {
        smssErvice.sendMessageTry();
        System.out.println("6 function");
        return new ResponseEntity<>("success", HttpStatus.OK);
    }

}
