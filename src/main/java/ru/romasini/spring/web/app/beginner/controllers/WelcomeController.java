package ru.romasini.spring.web.app.beginner.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class WelcomeController {

    @GetMapping("/")
    public String index(Model model){
        return "index";
    }

}
