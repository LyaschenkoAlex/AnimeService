package com.unicyb.controllers;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/hello_friend")
public class SuggestionController {
    @Secured(value={"ROLE_USER"})
    @GetMapping
    public String hi() {
        return "home";
    }
}
