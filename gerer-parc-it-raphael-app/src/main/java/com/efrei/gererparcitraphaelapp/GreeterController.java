package com.efrei.gererparcitraphaelapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreeterController {

    @GetMapping("/hello raphael")
    public String sayHello() {
        return "Hello!";
    }
}
