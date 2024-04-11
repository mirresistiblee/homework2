package com.example.demo.controller;

import com.example.demo.model.SignupModel;
import com.example.demo.repo.SignupRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//import java.util.List;

@Controller
public class BilgisayarSignupController {
    @Autowired
   // *SignupRepo databased1;
    private SignupRepo databased1;

    @GetMapping ("/signup")
   //* public String mainPageG(){
    public String PageG(){
        return "signup";
    }
   // List<SignupModel> gotValues = databased1.findAll();

       // model.addAttribute("name", "Ainura");

//        for (int i = 0; i < gotValues.size(); i++) {
//            System.out.println(gotValues.get(i).getLogin());
//        }


//        for (int i = 0; i < 100; i++) {
//            signUpRepo.save(new SignUpModel("Nurs"+i,i,"nurs.kg"+i, "password"+i));
//        }

    @PostMapping("/signup")
    public String mainPageP(String fullname, String email, String password){
        SignupModel data2 = new SignupModel(fullname, email, password);
        databased1.save(data2);
        return "redirect:/main";
    }

}