package com.example.firstspringapp.controller;

import com.example.firstspringapp.model.User;
import org.springframework.web.bind.annotation.*;

    //UC1
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
    //UC4
    @PostMapping("/post")
    public String sayHellopost(@RequestBody User user)
    {
        return "Hello " + user.getFirstName() + " "+  user.getLastName() + "!";
    }
    }