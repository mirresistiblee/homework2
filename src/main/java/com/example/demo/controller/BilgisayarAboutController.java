package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BilgisayarAboutController {

    @GetMapping ("/about.html")
    public String mainPageG(){
        return "about";
    }

    @PostMapping("/about.html")
    public String mainPageP(String name, String cardNumber, String email){
        System.out.println(name+" "+cardNumber+" "+email);
        return "about";
    }

}
