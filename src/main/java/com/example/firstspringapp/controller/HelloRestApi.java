package com.example.firstspringapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestApi {
    @RequestMapping("/hello")
    public String Hello() {
        return "hello from bridgelabz";
    }
    @RequestMapping(value = {"/query/{name}"}, method = RequestMethod.GET)
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}