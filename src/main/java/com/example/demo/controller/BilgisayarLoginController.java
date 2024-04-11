package com.example.demo.controller;

import com.example.demo.model.MainModel;
import com.example.demo.repo.MainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BilgisayarLoginController {
    @Autowired
    MainRepo databased;

    @GetMapping ("/login")
    public String mainPageG(){
        return "login";
    }

    @PostMapping("/login")
    public String mainPageP(String username, String password){
        MainModel data1 = new MainModel(username,password);
        databased.save(data1);
        return "redirect:/main";
    }

}
