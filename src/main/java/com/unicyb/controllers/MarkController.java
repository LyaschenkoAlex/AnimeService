package com.unicyb.controllers;

import com.unicyb.data.Mark;
import com.unicyb.repositories.MarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MarkController {

    @Autowired
    MarkRepository markRepository;
    @GetMapping("/marks")
    public List<Mark> getMarks() {
        System.out.println("qq");
        return markRepository.findAll();
    }
}
