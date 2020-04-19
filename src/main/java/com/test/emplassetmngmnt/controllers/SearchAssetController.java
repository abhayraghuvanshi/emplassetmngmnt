package com.test.emplassetmngmnt.controllers;

import com.test.emplassetmngmnt.beans.AssetCriteria;
import com.test.emplassetmngmnt.beans.Employee;
import com.test.emplassetmngmnt.beans.User;
import com.test.emplassetmngmnt.repository.EmployeeRepository;
import com.test.emplassetmngmnt.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SearchAssetController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/getAssetList")
    public String addEmployee(@ModelAttribute("newassetcriteria")AssetCriteria assetCriteria, Model model){
        System.out.println("in assetCriteria : assetCriteria");
        //get asset  
        System.out.println("assetCriteria list by assetCriteria ::-->"+assetCriteria);
        return "home";
    }
}
