package com.unicyb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SuggestionController {
    @GetMapping("/hello_friend")
    public String hi() {
        return "Hello world! QQQQQQQQQQQQQQQQQ";
    }
}
