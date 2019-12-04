package com.unicyb.controllers;

import com.unicyb.data.Mark;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class StarterController {

    @GetMapping("/starter")
    public String getMarks() {
        return "starter";
    }
}
