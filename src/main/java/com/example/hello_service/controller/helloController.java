package com.example.hello_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello(){
        ResponseEntity<String> response = ResponseEntity.ok("Hello Wolrd!");
        return response;
    }
}
