package com.example.firstspringapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestApi {
    @RequestMapping("/hello")
    public String Hello (){
        return "hello from bridgelabz";
    }
}
