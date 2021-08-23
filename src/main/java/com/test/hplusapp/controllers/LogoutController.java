package com.test.hplusapp.controllers;
import com.test.hplusapp.beans.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpSession;

@Controller
public class LogoutController {

    @ModelAttribute("login")
    public Login getDefaultLogin() {
        return new Login();
    }
    @GetMapping("/logout")
    public String logout(HttpSession session){
        System.out.println("Ending User Session");
        session.invalidate();
        return "login";
    }
}
