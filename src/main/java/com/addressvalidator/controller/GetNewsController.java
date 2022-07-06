package com.addressvalidator.controller;

import com.addressvalidator.service.GoogleApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/news")
public class GetNewsController {

    @Autowired GoogleApi googleApi;

    @GetMapping(value = "get")
    public ResponseEntity getNews()
        throws Exception {

        return googleApi.getNewsFromApi();
    }
}
