package com.test.emplassetmngmnt.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.test.emplassetmngmnt.beans.Asset;
import com.test.emplassetmngmnt.beans.AssetCriteria;
import com.test.emplassetmngmnt.beans.Employee;
import com.test.emplassetmngmnt.beans.User;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
	
	
    @GetMapping("/addEmployee")
    public String goToaddEmployee(@ModelAttribute("newEmployee")Employee employee, Model model){
        System.out.println("going to addemployee page");
        model.addAttribute("newEmployee", new Employee());
        return "addemployee";
    }
    
	
    @GetMapping("/viewassetList")
    public String goToviewassetList(@ModelAttribute("newassetcriteria")AssetCriteria assetCriteria, Model model){
        System.out.println("going to viewassetlist page");
        return "viewassetlist";
    }
    
	
    @GetMapping("/addasset")
    public String goToaddasset(@ModelAttribute("newAsset")Asset asset, Model model){
        System.out.println("going to addasset page");
        return "addasset";
    }
        
    @GetMapping("/home")
    public String goHome(){
        System.out.println("in home controller");
        return "index";
    }
    
    @GetMapping("/login")
    public String gologinHome(){
        System.out.println("in home to login controller");
        return "login";
    }

   

    @GetMapping("/goToLogin")
    public String goToLogin(){
        System.out.println("going to login page");
        return "login";
    }

    @GetMapping("/goToRegistration")
    public String goToRegistration(){
        System.out.println("going to register page");
        return "register";
    }

    @ModelAttribute("newuser")
    public User getDefaultUser(){
        return new User();
    }
    
    @ModelAttribute("newasset")
    public Asset getDefaultAsset(){
        return new Asset();
    }

    @ModelAttribute("genderItems")
    public List<String> getGenderItems(){
        return Arrays.asList(new String[]{"Male", "Female", "Other"});
    }
    @ModelAttribute("newEmployee")
    public Employee getDefaultEmployee(){
        return new Employee();
    }
 }
