package com.example.demo2sms.controller;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class SMSService {

    public void sendSMS(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
        map.add("password", "ndb123");
        map.add("message", "hello world");
        map.add("destinationAddresses","[tel:94773820436]");
        map.add("applicationId","APP_000001");


        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

        ResponseEntity<String> response = restTemplate.postForEntity("http://10.96.198.25:7000/sms/send", request , String.class );
        System.out.println(request);
    }
}
