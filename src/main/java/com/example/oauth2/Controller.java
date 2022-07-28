package com.example.oauth2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/")
    public String  helloWorld()
    {
        return "Hello World";
    }

    @GetMapping("/restricted")
    public String  restricted()
    {
        return "to see this tex you need to be logged";
    }
}

