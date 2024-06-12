package com.simple_jenkins_example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String view() {
        System.out.println("HELLO HOW R U?");
        return "W E L C O M E !";
    }

    @GetMapping("/demo")
    public String demo() {
        return "3K Technologies !!";
    }
}
