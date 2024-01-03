package com.example.hello.spring.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
@RequestMapping("/")
public class MainController {
     @GetMapping
    public String dado(@RequestParam int numberFaces, Model model){

        Random random = new Random();
        int randomNumber = random.nextInt(1, (numberFaces + 1));
        model.addAttribute("randomNumber", randomNumber);
        return "dado";
    }
}
