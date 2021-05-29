package org.mns237.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String debut(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("welcome to my Api @Idrice24 (project mns 237");
        return "welcome to my Api @Idrice24 (project mns 237)";
    }

}
