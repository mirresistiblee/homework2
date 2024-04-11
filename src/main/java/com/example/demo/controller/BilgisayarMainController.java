package com.example.demo.controller;

import com.example.demo.model.MainModel;
import com.example.demo.repo.MainRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BilgisayarMainController {
    @Autowired
    private MainRepo mainRepo;

    @GetMapping("/main")
    public String mainPageG() {
        return "index";
    }

    @PostMapping("/")
    //login , username
    public String mainPageP(String username, String password) {
       // mainRepo.save(new MainModel(username, password));
        MainModel mainModel = new MainModel(username, password);
        mainRepo.save(mainModel);
        return "index";
    }

}
