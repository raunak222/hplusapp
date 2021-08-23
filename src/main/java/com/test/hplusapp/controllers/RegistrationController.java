package com.test.hplusapp.controllers;
import com.test.hplusapp.beans.User;
import com.test.hplusapp.beans.Login;
import com.test.hplusapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class RegistrationController {
    @Autowired
    private UserRepository userRepository;

    @ModelAttribute("login")
    public Login getDefaultLogin() {
        return new Login();
    }

    @ModelAttribute("newuser")
    public User getDefaultUser(){
        return new User();
    }

    @PostMapping("/registeruser")
    public  String registerUser(@ModelAttribute("newuser")User user, Model model){
        System.out.println("in registration controller");
        userRepository.save(user);
        model.addAttribute("dataSaved","User registered successfully");
        return "login";
    }
}
