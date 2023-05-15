package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {
    @Value("${app.message}")
    String message;
    @GetMapping("/hey")
    public String holaMundo(){
        return message;
    }


    @GetMapping("/bootsrap fake")
    public String bootstrap(){
        return "Se su pone que debe de devolver bootstrap fragment here";
    }
}
