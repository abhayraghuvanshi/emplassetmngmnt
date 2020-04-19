package com.test.emplassetmngmnt.controllers;

import com.test.emplassetmngmnt.beans.User;
import com.test.emplassetmngmnt.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginValidateController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/home1")
    public String validateUser(@ModelAttribute("newuser")User user, Model model){
        System.out.println("in user validation controller : Home1Controller");
        //userRepository.save(user);   TODO Validate user and move to home screen.
        model.addAttribute("dataSaved", "User loggedIn successfully");
        return "home";
    }
}
