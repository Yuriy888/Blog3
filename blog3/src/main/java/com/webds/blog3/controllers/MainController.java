package com.webds.blog3.controllers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
 @RestController
// @Controller
public class MainController {

    @GetMapping("/")
    public String home (Model model) {
        // model.addAttribute("title","Головна сторінка");
        return "home";
    }
}
// "title","Головна сторінка