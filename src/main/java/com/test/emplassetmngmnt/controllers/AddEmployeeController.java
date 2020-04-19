package com.test.emplassetmngmnt.controllers;

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
public class AddEmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @PostMapping("/insertaddemployee")
    public String addEmployee(@ModelAttribute("newEmployee")Employee employee, Model model){
        System.out.println("in add new employee controller : AddEmployeeController");
        employeeRepository.save(employee);   
        System.out.println("employee just saved::-->"+employee);
        model.addAttribute("dataSaved", "added new employee");
        return "home";
    }
}
