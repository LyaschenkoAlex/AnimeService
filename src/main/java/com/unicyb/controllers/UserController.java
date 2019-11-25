package com.unicyb.controllers;

import com.unicyb.data.Title;
import com.unicyb.data.User;
import com.unicyb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Controller
public class UserController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("user")
    public String showInfoAboutUser(Model model, Principal principal) {
        String userName = principal.getName();
        User user = userRepository.findByName(userName);
        model.addAttribute("user", user);
        return "PersonalAccount";
    }

}
