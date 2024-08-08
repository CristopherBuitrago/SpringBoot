package com.springdemo.spring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springdemo.spring.model.ParamsDto;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("api/demovar")
public class PathVariableController {
    @GetMapping("/saludo/{message}")
    public ParamsDto saludo(@RequestParam String param) {
        ParamsDto params = new ParamsDto();
        params.setMessage(param);
        return params;
    }
    
}