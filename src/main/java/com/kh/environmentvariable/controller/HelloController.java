package com.kh.environmentvariable.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class HelloController {

    @Value("${DATABASE_NAME}")
    private String databaseName;

    @Value("${USER_NAME}")
    private String userName;

    @Value("${PASSWORD}")
    private String password;

    @GetMapping
    public ResponseEntity<List<String>> hello() {
        return new ResponseEntity<>(
            List.of(
                databaseName,
                userName,
                password
            )
        , HttpStatus.OK);
    }
}
