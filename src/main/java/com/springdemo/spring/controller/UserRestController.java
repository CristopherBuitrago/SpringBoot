package com.springdemo.spring.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.spring.model.User;

@RestController
@RequestMapping("/user")
public class UserRestController {

    @GetMapping("/details")
    public Map<String,Object> details() {
        // Map<String, Object> body = new HashMap<>();
        // body.put("title", "Prueba con rest controller");
        // body.put("descripcion", "Se hace una prueba con rest controller");
        // return body;
    
        User user = new User("Cristopher", "Buitrago");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Usuarios registrados");
        body.put("usuarios", user);
        return body;
    }
}
