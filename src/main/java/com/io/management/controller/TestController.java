package com.io.management.controller;

import com.io.management.service.TestService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public record TestController(
        TestService testService
) {
    @GetMapping
    public ResponseEntity<String> greet() {

        return new ResponseEntity(testService.greetings(), HttpStatus.OK);
    }
}
