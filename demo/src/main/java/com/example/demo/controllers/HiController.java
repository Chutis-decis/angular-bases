package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HiController {
    @GetMapping("/app/foo")
    public Map<String, Object> foo(){
        Map<String, Object> json = new HashMap<>();

        json.put("message", "Hola mundo spring boot api rest");
        json.put("date", new Date());

        return json;
    }
}
