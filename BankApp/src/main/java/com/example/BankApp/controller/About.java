package com.example.BankApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class About{

    @GetMapping("/about")
    public String about() {
        return "about"; // Name of the HTML file
    }
}
