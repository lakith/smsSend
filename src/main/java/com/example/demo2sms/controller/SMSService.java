package com.example.demo2sms.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SMSService {

    public void sendSMS(){
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        MultiValueMap<String, String> map= new LinkedMultiValueMap<>();
        map.add("password", "ndb123");
        map.add("message", "hello world");
        map.add("destinationAddresses","[\"tel:94773621315\"]");
        map.add("applicationId","APP_000001");


        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<MultiValueMap<String, String>>(map, headers);

        ResponseEntity<String> response = restTemplate.postForEntity("http://10.96.198.25:7000/sms/send", request , String.class );
        System.out.println(response);
    }

    public void sendSms2(){

        RestTemplate rest = new RestTemplate();
        System.out.println("1");
        HttpHeaders headers = new HttpHeaders();
        System.out.println("2");
        headers.set("Content-Type", "application/json");
        System.out.println("3");
        String s = "{\n" +
                "\n" +
                "  \"password\": \"ndb123\",\n" +
                "\n" +
                "  \"destinationAddresses\": [\"tel:94773621315\"],\n" +
                "\n" +
                "  \"message\": \"hello world\",\n" +
                "\n" +
                "  \"applicationId\":\"APP_000001\",\n" +
                "}";
        System.out.println("4");
        HttpEntity<String> entity = new HttpEntity<>(s, headers);
        System.out.println("5");
        rest.postForObject("http://10.96.198.25:7000/sms/send", entity, String.class);
        System.out.println("6");
        System.out.println(s);

    }

    public void smsSend3(){
        // TODO Auto-generated method stub
        MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
        Map map = new HashMap();
        map.put("Content-Type", "application/json");

        headers.setAll(map);

        Map req_payload = new HashMap();
        req_payload.put("password", "ndb123");
        req_payload.put("message", "hello world");
        req_payload.put("destinationAddresses","[\"tel:94773621315\"]");
        req_payload.put("applicationId","APP_000001");

        HttpEntity<?> request = new HttpEntity<>(req_payload, headers);
        String url = "http://10.96.198.25:7000/sms/send";


        ResponseEntity<?> response = new RestTemplate().postForEntity(url, request, String.class);
        System.out.println(response);
    }

    public void smsSend4(){
        final String uri = "http://10.96.198.25:7000/sms/send";

        SmsDTO smsDTO = new SmsDTO();
        smsDTO.setPassword("ndb123");
        smsDTO.setMessage("hello world");
        smsDTO.setApplicationId("APP_000001");

        HttpHeaders headers = new HttpHeaders();
        headers.set("Content-Type", "application/json");
        HttpEntity<String> entity = new HttpEntity(smsDTO, headers);

        List<String> stringList = new ArrayList<>();
        stringList.add("[tel:94773621315]");

        RestTemplate restTemplate = new RestTemplate();
        restTemplate.postForObject( uri, entity, String.class);

        System.out.println(smsDTO);
    }

    public static void main(String[] args){
        String s = "{\n" +
                "\n" +
                "  \"password\": \"ndb123\",\n" +
                "\n" +
                "  \"destinationAddresses\": [\"tel:94773820436\"],\n" +
                "\n" +
                "  \"message\": \"hello world\",\n" +
                "\n" +
                "  \"applicationId\":\"APP_000001\",\n" +
                "}";

        System.out.println(s);
    }

    public void sendRequest() throws Exception {

        try {
            RestTemplate rest = new RestTemplate();
            String s = "{\n" +
                    "\n" +
                    "  \"password\": \"ndb123\",\n" +
                    "\n" +
                    "  \"destinationAddresses\": [\"tel:94773621315\"],\n" +
                    "\n" +
                    "  \"message\": \"hello world\",\n" +
                    "\n" +
                    "  \"applicationId\":\"APP_000001\",\n" +
                    "}";

            HttpHeaders headers = new HttpHeaders();
            headers.set("Content-Type", "application/json");

            HttpEntity<String> entity = new HttpEntity<>(s, headers);
            ResponseEntity<Object> exchange = rest.exchange("http://10.96.198.25:7000/sms/send", HttpMethod.POST, entity, Object.class);
            System.out.println(exchange);
        } catch (HttpClientErrorException e) {
            throw new Exception(e.getCause());
        } catch (Exception err) {
            throw new Exception(err.getCause());
        }
    }
}
