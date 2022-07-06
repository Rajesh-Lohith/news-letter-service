package com.addressvalidator.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GoogleApi {

    private String API_URL = "https://newsapi.org/v2/everything?q=tesla&from=2022-06-06&sortBy=publishedAt&apiKey=5a26d8250bec4722bb62f016fa5a892d";

    public ResponseEntity<String> getNewsFromApi() {

        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForEntity(API_URL, String.class);
    }


}
