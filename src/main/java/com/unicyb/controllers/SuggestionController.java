package com.unicyb.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class SuggestionController {
    @GetMapping("/qq")
    public String hi() {
        return "Hello world! QQQQQQQQQQQQQQQQQ";
    }
}
