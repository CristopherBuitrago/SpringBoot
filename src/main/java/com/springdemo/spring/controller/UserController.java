package com.springdemo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.springdemo.spring.model.User;


@Controller
public class UserController {
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Cristopher", "Buitrago"); 
        model.addAttribute("title", "Seccion de profesiones");
        model.addAttribute("user", user);
        return "details";
    }
    
}