package com.unicyb.controllers;

import com.unicyb.data.Title;
import com.unicyb.repositories.TitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TitleController {

    @Autowired
    TitleRepository titleRepository;
    @GetMapping("anime/{id}")
    public String showTitle(Model model, @PathVariable("id") int id) {
        Title title = titleRepository.getOne(id);
        model.addAttribute("title", title);
        return "anime";
    }

    @GetMapping("show_all_anime")
    public String showAllAnime(Model model) {
        List<Title> titles = titleRepository.findAll();
        model.addAttribute("allAnime", titleRepository.findAll());
        return "anime copy";
    }

    public void createTitle(Title title) {
        titleRepository.save(title);
    }
}
