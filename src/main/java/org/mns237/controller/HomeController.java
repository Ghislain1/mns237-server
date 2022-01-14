package org.mns237.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "https://idrice24.github.io/mns/home", maxAge = 3600)
public class HomeController {
    
    public HomeController(){

    }

    @GetMapping("/home/app")
    public String homePage(){
        return "welcome to my wep app";
    }

}
