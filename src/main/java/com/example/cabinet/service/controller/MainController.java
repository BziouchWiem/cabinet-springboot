package com.example.cabinet.service.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    // Mapping to show the main page with the sidebar
    @GetMapping("/menu")
    public String showMainPage() {
        return "index"; // Returns the main index.html page
    }
}
