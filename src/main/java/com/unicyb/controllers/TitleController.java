package com.unicyb.controllers;

import com.unicyb.data.Title;
import com.unicyb.repositories.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TitleController {

    @Autowired
    TitleRepository titleRepository;
    @GetMapping("/title/{id}")
    public String showTitle(@PathVariable("id") int id) {
        Title title = titleRepository.getOne(id);
        return title.toString();
    }

    public void createTitle(Title title) {
        titleRepository.save(title);
    }
}
