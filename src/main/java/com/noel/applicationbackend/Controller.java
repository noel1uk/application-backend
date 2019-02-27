package com.noel.applicationbackend;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/")
    public String greeting() {
        return "{id: 123, content: \"Hello\", city: \"New York\"}";
    }
}
