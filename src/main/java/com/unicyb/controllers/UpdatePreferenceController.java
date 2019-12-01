package com.unicyb.controllers;

import com.unicyb.data.User;
import com.unicyb.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class UpdatePreferenceController {
    @Autowired
    UserRepository userRepository;
    @GetMapping("update_preference")
    public String updatePreference() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("/home/alex/IdeaProjects/AnimeService/sug_list.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] splitLine = line.split(" ", 2);
                User user = userRepository.findById(Integer.parseInt(splitLine[0]));
                user.setTypeOfPreference(splitLine[1]);
                userRepository.save(user);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "starter";
    }
}
