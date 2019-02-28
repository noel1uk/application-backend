package com.noel.applicationbackend;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public ResponseEntity<String> greeting() {
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Access-Control-Allow-Origin", "http://localhost:4200");
        return new ResponseEntity<>(
                "{\"id\": 123, \"content\": \"Hello\", \"city\": \"New York\"}",
                responseHeaders,
                HttpStatus.OK);
    }
}
