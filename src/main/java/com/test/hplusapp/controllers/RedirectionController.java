package com.test.hplusapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RedirectionController {

    @GetMapping("/redirectToLinkedin")
    public String redirectOut(){
        System.out.println("in redirect Controller");
        return "redirect:http://www.linkedin.com";
    }
}
