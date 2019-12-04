package com.unicyb.controllers;

import com.unicyb.data.Title;
import com.unicyb.data.User;
import com.unicyb.repositories.TitleRepository;
import com.unicyb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class TitleController {

    @Autowired
    TitleRepository titleRepository;
    @Autowired
    UserRepository userRepository;
    @GetMapping("anime/{id}")
    public String showTitle(Model model, @PathVariable("id") int id, Principal principal) {
        Title title = titleRepository.getOne(id);
        model.addAttribute("title", title);
        User user = userRepository.findByName(principal.getName());
        String[] preferences = user.getTypeOfPreference().split(" ");
        List<Title> titles = new ArrayList<>();
        Title title1 = titleRepository.findById(Integer.parseInt(preferences[0])).get();
        Title title2 = titleRepository.findById(Integer.parseInt(preferences[1])).get();
        Title title3 = titleRepository.findById(Integer.parseInt(preferences[2])).get();
        titles.add(title1);
        titles.add(title2);
        titles.add(title3);
        model.addAttribute("titles", titles);
        return "anime";
    }

    @GetMapping("show_all_anime")
    public String showAllAnime(Model model) {
        model.addAttribute("role", SecurityContextHolder.getContext().getAuthentication().getName());
        List<Title> titles = titleRepository.findAll();
        model.addAttribute("allAnime", titleRepository.findAll());
        return "anime copy";
    }

    public void createTitle(Title title) {
        titleRepository.save(title);
    }
}
