package com.example.firstspringapp.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloRestApi {
    @RequestMapping("/hello")
    public String Hello() {
        return "hello from bridgelabz";
    }
    //UC2
    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHelloParam(@RequestParam(value = "name") String name)
    {
        return "Hello " + name + "!";
    }
    //UC3
    @RequestMapping ("/query/{name}")
    public String sayHello(@PathVariable String name) {
        return "Hello " + name + "!";
    }
}