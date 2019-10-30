package com.unicyb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TitleController {

    @GetMapping("/")
    public String hi() {
        return "Hello world!";
    }
}
