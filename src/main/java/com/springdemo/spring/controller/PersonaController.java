package com.springdemo.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springdemo.spring.model.Persona;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PersonaController {
    @PostMapping("/crearpersona")
    public String crearpersona(@RequestParam Integer id, @RequestParam String nombre, @RequestParam String apellido, Model model) {
        Persona persona = new Persona(id, nombre, apellido);
        model.addAttribute("persona", persona);
        return "crearpersona";
    }

    @GetMapping("/crearpersona")
    public String obtenerPersona(Model model) {
        model.addAttribute("persona", new Persona());
        return "crearpersona";
    }
    
}